package in.atos.jersey.health.insurance.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import in.atos.jersey.health.insurance.entity.CaseWorker;
import in.atos.jersey.health.insurance.entity.PlanMasterEntity;

public interface AdminRepository extends JpaRepository<PlanMasterEntity, Long>
{
	
	  // List<PlanMasterEntity> findAllPlans();

	PlanMasterEntity findByPlanId(Long planId);
	    
}


