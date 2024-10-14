package in.atos.jersey.health.insurance.serviceimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.atos.jersey.health.insurance.binding.Child;
import in.atos.jersey.health.insurance.binding.DcSummary;
import in.atos.jersey.health.insurance.binding.Education;
import in.atos.jersey.health.insurance.binding.Income;
import in.atos.jersey.health.insurance.binding.PlanSelection;
import in.atos.jersey.health.insurance.entity.CitizenAppEntity;
import in.atos.jersey.health.insurance.entity.DcCaseEntity;
import in.atos.jersey.health.insurance.entity.DcChildren;
import in.atos.jersey.health.insurance.entity.DcEducationEntity;
import in.atos.jersey.health.insurance.entity.DcIncomeEntity;
import in.atos.jersey.health.insurance.entity.PlanMasterEntity;
import in.atos.jersey.health.insurance.repository.CitizenAppRepository;
import in.atos.jersey.health.insurance.repository.DcCaseEntityRepository;
import in.atos.jersey.health.insurance.repository.DcChildrenRepository;
import in.atos.jersey.health.insurance.repository.DcEducationRepository;
import in.atos.jersey.health.insurance.repository.DcIncomeEntityRepository;
import in.atos.jersey.health.insurance.repository.PlanMasterRepository;
import in.atos.jersey.health.insurance.service.DcService;


@Service
public class DcServiceImpl implements DcService {

	@Autowired
	private DcCaseEntityRepository caseEntityRepository;

	@Autowired
	private PlanMasterRepository planMasterRepository;
	
	@Autowired
	private CitizenAppRepository appRepository;
	
	@Autowired
	private DcIncomeEntityRepository dcIncomeEntityRepository;
	
	@Autowired
	private DcEducationRepository dcEducationRepository;
	
	@Autowired
	private DcChildrenRepository childrenRepository;
	


	@Override
	public List<String> getPlanNames() {

		List<PlanMasterEntity> findAll = planMasterRepository.findAll();
		List<String> plans = new ArrayList<>();
		for (PlanMasterEntity entity : findAll) {
              plans.add(entity.getPlanName());
		}
		return plans;
	}

	@Override
	public Long savePlanSelection(PlanSelection planSelection) {
		
		Optional<DcCaseEntity> findById = caseEntityRepository.findById(planSelection.getCaseNum());
		
		if(findById.isPresent()) {
			DcCaseEntity dcCaseEntity = findById.get();
			dcCaseEntity.setPlanId(planSelection.getPlanId());
			
			caseEntityRepository.save(dcCaseEntity);
			
			return planSelection.getCaseNum();
		}
		
		return null;
	}

	@Override
	public Long loadCaseNum(Integer appId) {

		Optional<CitizenAppEntity> app = appRepository.findById(appId);
		
		if(app.isPresent()) {
			DcCaseEntity caseEntity = new DcCaseEntity();
			caseEntity.setAppId(appId);
			
			caseEntity = caseEntityRepository.save(caseEntity);
			return caseEntity.getCaseNum();
		}
		return 0l;
	}
	@Override
	public Long saveIncomeData(Income income) {
		DcIncomeEntity dcIncomeEntity = new DcIncomeEntity();
		BeanUtils.copyProperties(income, dcIncomeEntity);
		dcIncomeEntityRepository.save(dcIncomeEntity);
		return income.getCaseNum();
	}

	@Override
	public Long saveEducation(Education education) {
	    DcEducationEntity dcEducationEntity = new DcEducationEntity();
	    BeanUtils.copyProperties(education, dcEducationEntity);
	    dcEducationRepository.save(dcEducationEntity);
		return education.getCaseNum();
	}

	@Override
	public Long saveChildren(List<Child> childs) {
        
		for(Child c : childs) {
			DcChildren dcChildren = new DcChildren();
			BeanUtils.copyProperties(c, dcChildren);
		}
		
		return childs.get(0).getCaseNum();
	}

	@Override
	public DcSummary getSummary(Long caseNum) {
		
		String planName = "";
		
		DcIncomeEntity incomeEntity = dcIncomeEntityRepository.findByCaseNum(caseNum);
		DcEducationEntity educationEntity = dcEducationRepository.findByCaseNum(caseNum);
		List<DcChildren> childrenEntity = childrenRepository.findByCaseNum(caseNum);
		
		Optional<DcCaseEntity> dcCase = caseEntityRepository.findById(caseNum); //TBD
		if(dcCase.isPresent()) {
			Long planId = dcCase.get().getCaseNum();
			Optional<PlanMasterEntity> plan = planMasterRepository.findById(planId);
			if(plan.isPresent()) {
				planName = plan.get().getPlanName();
			}
			
		}
		
		//set the data to summary object
		DcSummary summary = new DcSummary();
		summary.setPlanName(planName);
		
		Income income = new Income();
		BeanUtils.copyProperties(incomeEntity, income);
		summary.setIncome(income);
		
		Education education = new Education();
		BeanUtils.copyProperties(educationEntity, education);
		summary.setEducation(education);
		
		List<Child> childs = new ArrayList<>();
		
             for(DcChildren entity :childrenEntity) {
            	 Child ch = new Child();
            	 BeanUtils.copyProperties(entity, ch);
            	 childs.add(ch);
             }
             summary.setChilds(childs);
             
             
		return summary;
	}

	

}
