package in.atos.jersey.health.insurance.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.atos.jersey.health.insurance.entity.DcEducationEntity;

public interface DcEducationRepository extends JpaRepository<DcEducationEntity, Serializable>{

	DcEducationEntity findByCaseNum(Long caseNum);

}
