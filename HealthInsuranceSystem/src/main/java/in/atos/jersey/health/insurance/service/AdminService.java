package in.atos.jersey.health.insurance.service;

import java.util.List;

import in.atos.jersey.health.insurance.entity.CaseWorker;
import in.atos.jersey.health.insurance.entity.PlanMasterEntity;

public interface AdminService 
{
	PlanMasterEntity createPlan(PlanMasterEntity planMasterEntity);
	PlanMasterEntity updatePlan(Long planId , PlanMasterEntity planMasterEntity);
	List<PlanMasterEntity> listAllPlans();
	PlanMasterEntity getPlanById(long planId);
	void deletePlan(Long planId);
	
	
	CaseWorker createCaseworker(CaseWorker caseWorker);
	CaseWorker updateCaseWorker(Long accId , CaseWorker caseWorker);
	void deleteCaseworker(Long accId);
	CaseWorker activateCaseWorker(Long accId);
    CaseWorker deactivateCaseWorker(Long accId);
	List<CaseWorker> listAllCaseWorkers();
	

	CaseWorker findCaseWorkerById(Long accId);

	
}

