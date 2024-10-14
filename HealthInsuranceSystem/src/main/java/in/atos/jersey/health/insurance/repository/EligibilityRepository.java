package in.atos.jersey.health.insurance.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.atos.jersey.health.insurance.entity.EligibilityDtls;
import in.atos.jersey.health.insurance.entity.PlanMasterEntity;
import in.atos.jersey.health.insurance.service.EligibilityService;

public interface EligibilityRepository extends JpaRepository<EligibilityDtls, Serializable>
{

}
