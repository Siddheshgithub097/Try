package in.atos.jersey.health.insurance.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.atos.jersey.health.insurance.entity.PlanMasterEntity;

public interface PlanMasterRepository extends JpaRepository<PlanMasterEntity, Serializable>{

}
