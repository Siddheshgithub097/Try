package in.atos.jersey.health.insurance.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import in.atos.jersey.health.insurance.entity.CaseWorker;

public interface CaseWorkerRepository extends JpaRepository<CaseWorker, Serializable> 
{
    CaseWorker findById(Long accId);  // use findById instead of findCaseWorkerById
    
    List<CaseWorker> findAllCaseWorkers();

    CaseWorker findCaseWorkerById(Long accId);

	CaseWorker save(CaseWorker caseWorker);
}