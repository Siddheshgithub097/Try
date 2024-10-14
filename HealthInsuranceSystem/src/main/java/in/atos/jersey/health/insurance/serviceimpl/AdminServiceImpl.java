package in.atos.jersey.health.insurance.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.atos.jersey.health.insurance.entity.CaseWorker;
import in.atos.jersey.health.insurance.entity.PlanMasterEntity;
import in.atos.jersey.health.insurance.exception.ResourceNotFoundException;
import in.atos.jersey.health.insurance.repository.AdminRepository;
import in.atos.jersey.health.insurance.repository.CaseWorkerRepository;
import in.atos.jersey.health.insurance.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminRepository adminRepository;
	
	@Autowired
	private CaseWorkerRepository caseWorkerRepository;
	
	@Override
	public PlanMasterEntity createPlan(PlanMasterEntity planMasterEntity)
	{
		
		return adminRepository.save(planMasterEntity);
	}
	
	@Override
    public PlanMasterEntity updatePlan(Long planId, PlanMasterEntity plan)
	{
        PlanMasterEntity existingPlan = adminRepository.findByPlanId(planId);
       if(existingPlan==null)
       {
    	   throw new ResourceNotFoundException("Plan not found with ID: " + planId);
       }
      
        existingPlan.setPlanName(plan.getPlanName());
        existingPlan.setPlanStartDate(plan.getPlanStartDate());
        existingPlan.setPlanEndDate(plan.getPlanEndDate());
        existingPlan.setActiveSw(plan.getActiveSw());
        existingPlan.setUpdatedBy(plan.getUpdatedBy());
        return adminRepository.save(existingPlan);
    }

	@Override
	public List<PlanMasterEntity> listAllPlans() {
	    return adminRepository.findAll();
	}

	@Override
	public PlanMasterEntity getPlanById(long planId) {
		 PlanMasterEntity plan = adminRepository.findByPlanId(planId);
	        if (plan == null) {
	            throw new ResourceNotFoundException("Plan not found with ID: " + planId);
	        }
	        return plan;
	}

	@Override
    public void deletePlan(Long planId) {
        PlanMasterEntity plan = adminRepository.findByPlanId(planId);
        if (plan == null) {
            throw new ResourceNotFoundException("Plan not found with ID: " + planId);
        }
        adminRepository.deleteById(planId);
    }

	
	
	
	// Caseworker 

	@Override
	public CaseWorker createCaseworker(CaseWorker caseWorker)
	{
		return caseWorkerRepository.save(caseWorker);
	}

	@Override
    public CaseWorker updateCaseWorker(Long accId, CaseWorker caseWorker)
	{
        CaseWorker existingWorker = caseWorkerRepository.findCaseWorkerById(accId);
        if (existingWorker == null) {
            throw new ResourceNotFoundException("Case Worker not found with ID: " + accId);
        }
        existingWorker.setFullname(caseWorker.getFullname());
        existingWorker.setEmail(caseWorker.getEmail());
        existingWorker.setPhno(caseWorker.getPhno());
        existingWorker.setGender(caseWorker.getGender());
        existingWorker.setActiveSw(caseWorker.getActiveSw());
        existingWorker.setUpdatedBy(caseWorker.getUpdatedBy());
        return caseWorkerRepository.save(existingWorker);
    }

    @Override
    public List<CaseWorker> listAllCaseWorkers() {
        return caseWorkerRepository.findAllCaseWorkers();
    }

    @Override
    public void deleteCaseworker(Long accId) {
        CaseWorker caseWorker = caseWorkerRepository.findCaseWorkerById(accId);
        if (caseWorker == null) {
            throw new ResourceNotFoundException("Case Worker not found with ID: " + accId);
        }
        adminRepository.deleteById(accId);
    }

    @Override
    public CaseWorker activateCaseWorker(Long accId) {
        CaseWorker worker = caseWorkerRepository.findCaseWorkerById(accId);
        if (worker == null) {
            throw new ResourceNotFoundException("Case Worker not found with ID: " + accId);
        }
        worker.setActiveSw("Y");
        return caseWorkerRepository.save(worker);
    }

    @Override
    public CaseWorker deactivateCaseWorker(Long accId) {
        CaseWorker worker = caseWorkerRepository.findCaseWorkerById(accId);
        if (worker == null) {
            throw new ResourceNotFoundException("Case Worker not found with ID: " + accId);
        }
        worker.setActiveSw("N");
        return caseWorkerRepository.save(worker);
    }

    @Override
    public CaseWorker findCaseWorkerById(Long accId) {
        CaseWorker caseWorker = caseWorkerRepository.findCaseWorkerById(accId);
        if (caseWorker == null) {
            throw new ResourceNotFoundException("Case Worker not found with ID: " + accId);
        }
        return caseWorker;
    }


	
}
