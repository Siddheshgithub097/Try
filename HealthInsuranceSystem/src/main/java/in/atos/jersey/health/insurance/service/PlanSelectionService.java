package in.atos.jersey.health.insurance.service;

import java.util.List;

import in.atos.jersey.health.insurance.entity.PlanMasterEntity;

public interface PlanSelectionService 
{
	List<PlanMasterEntity> getAvailablePlans(); 
	PlanMasterEntity selectPlanForCitizen(Long appId, Integer planId);  //citizen id & planid
    boolean isCitizenEligibleForPlan(Long appId, Integer planId);
}
