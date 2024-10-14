package in.atos.jersey.health.insurance.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.atos.jersey.health.insurance.entity.DcCaseEntity;
import in.atos.jersey.health.insurance.entity.DcIncomeEntity;

public interface DcIncomeEntityRepository extends JpaRepository<DcIncomeEntity, Serializable> {

	DcIncomeEntity findByCaseNum(Long caseNum);

	DcIncomeEntity findByAppId(Long appId);

	DcCaseEntity findByAppIdAndPlanName(Long appId, String string);

	

}
