package in.atos.jersey.health.insurance.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.atos.jersey.health.insurance.entity.CitizenAppEntity;
import in.atos.jersey.health.insurance.entity.PlanMasterEntity;
import in.atos.jersey.health.insurance.exception.CitizenNotFoundException;
import in.atos.jersey.health.insurance.exception.PlanNotFoundException;
import in.atos.jersey.health.insurance.repository.CitizenAppRepository;
import in.atos.jersey.health.insurance.repository.PlanMasterRepository;
import in.atos.jersey.health.insurance.service.PlanSelectionService;

@Service
public class PlanSelectionServiceImpl implements PlanSelectionService {

	
	@Autowired
	private PlanMasterRepository planMasterRepository ;
	
	@Autowired
	private CitizenAppRepository citizenAppRepository ;
	
	
	
	@Override
	public List<PlanMasterEntity> getAvailablePlans()
	{
		
		return planMasterRepository.findAll();
	}


	public PlanMasterEntity selectPlanForCitizen(Long appId, Integer planId) {
	    CitizenAppEntity citizenApp = citizenAppRepository.findById(appId)
	        .orElseThrow(() -> new CitizenNotFoundException("Citizen application not found with id: " + appId));
	    
	    PlanMasterEntity plan = planMasterRepository.findById(planId)
	        .orElseThrow(() -> new PlanNotFoundException("Plan not found with id: " + planId));
	    
	   

	    return plan;
	}
	

    @Override
    public boolean isCitizenEligibleForPlan(Long appId, Integer planId) 
    {
        
        CitizenAppEntity citizenApp = citizenAppRepository.findById(appId)
        		.orElseThrow(() -> new CitizenNotFoundException("Citizen application not found with id: " + appId));
        
       
        PlanMasterEntity plan = planMasterRepository.findById(planId)
        		.orElseThrow(() -> new PlanNotFoundException("Plan not found with id: " + planId));
        
        boolean isEligible = true; 

       
        if (citizenApp.getStateName() == null || !citizenApp.getStateName().equals("New Jersey")) {
            isEligible = false; 
       
    }
        return isEligible;
    }
		

    
}

