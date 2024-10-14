package in.atos.jersey.health.insurance.serviceimpl;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.atos.jersey.health.insurance.entity.CitizenAppEntity;
import in.atos.jersey.health.insurance.entity.DcCaseEntity;
import in.atos.jersey.health.insurance.entity.DcChildren;
import in.atos.jersey.health.insurance.entity.DcIncomeEntity;
import in.atos.jersey.health.insurance.repository.CitizenAppRepository;
import in.atos.jersey.health.insurance.repository.DcCaseEntityRepository;
import in.atos.jersey.health.insurance.repository.DcChildrenRepository;
import in.atos.jersey.health.insurance.repository.DcIncomeEntityRepository;
import in.atos.jersey.health.insurance.repository.EligibilityRepository;
import in.atos.jersey.health.insurance.service.EligibilityService;
import jakarta.persistence.EntityNotFoundException;

@Service
public class EligibilityServiceImpl implements EligibilityService {

	@Autowired
	private EligibilityRepository eligibilityRepository;
	
	@Autowired
	private CitizenAppRepository citizenAppRepository ;
	
	@Autowired
	private DcIncomeEntityRepository dcIncomeEntityRepository;
	
	@Autowired
	private DcChildrenRepository childrenRepository ;
	
	@Autowired
	private DcCaseEntityRepository caseEntityRepository;

	// -> SNAP is a food stamp program, SNAP is applicable for the citizens who are having no-income or low-income
	
	@Override
	public boolean checkEligibilityForSNAP(Long appId) {
	   
	    CitizenAppEntity citizenAppEntity = citizenAppRepository.findById(appId)
	        .orElseThrow(() -> new EntityNotFoundException("Application not found"));

	   
	    if (!"New Jersey".equalsIgnoreCase(citizenAppEntity.getStateName())) {
	        return false; 
	    }

	   
	    DcIncomeEntity incomeEntity = dcIncomeEntityRepository.findByAppId(appId); 
	    
	    // Check if income is below or equal to 50,000
	    if (incomeEntity != null && incomeEntity.getEmpIncome() <= 50000) {
	        return true; 
	    }
	    return false;
	}
	
	

// -> CCAP is a children's program, CCAP is applicable for the families who are having less income with children's
 

	@Override
	public boolean checkEligibilityForCCAP(Long appId) 
	{
		List<DcChildren> childrens = childrenRepository.findbyappId(appId);
		
		if(childrens!=null && childrens.isEmpty())
		{
			return true;
		}
		return false;
	}
	
	
	
//  -> Medicaid is a health plan,  Medicaid is applicable for the people with limited income and resources.

	 @Override
	    public boolean checkEligibilityForMedicaid(Long appId) 
	 	{
	       DcIncomeEntity incomeEntity = dcIncomeEntityRepository.findByAppId(appId);
	       if(incomeEntity != null && incomeEntity.getEmpIncome()<=30000)
	       {
	    	   return true;
	       }
	        return false;
	    }

	 /* 
	  @Override
	public boolean checkEligibilityForMedicaid(Long appId) {
   DcIncomeEntity incomeEntity = dcIncomeEntityRepository.findByAppId(appId);
   // Check if income is below or equal to 30,000
   return incomeEntity != null && incomeEntity.getEmpIncome() <= 30000;
	}
	  */

	 

// -> Medicare is a health plan, Medicare is applicable for the people who are having above 65 years
	 
	 @Override
	 public boolean checkEligibilityForMedicare(Long appId) {
	     
	     CitizenAppEntity citizen = citizenAppRepository.findByAppId(appId)
	         .orElseThrow(() -> new EntityNotFoundException("Application not found"));

	     // Check if citizen is above 65 years of age for Medicare eligibility
	     if (citizen.getDob().isBefore(LocalDate.now().minusYears(65))) {
	         return true; // Eligible if age is above 65
	     }
	     return false;
	 }
	 
	
//  -> QHP is a health plan and it is commercial plan (People should purchase this plan)

	@Override
	public boolean checkEligibilityForQHP(Long appId) 
	{
		DcCaseEntity caseEntitydetails = dcIncomeEntityRepository.findByAppIdAndPlanName(appId,"QHP");
		return caseEntitydetails !=null;
		
	
	}
	
	

}
