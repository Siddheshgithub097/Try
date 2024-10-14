package in.atos.jersey.health.insurance.service;

import java.util.List;

import in.atos.jersey.health.insurance.binding.Child;
import in.atos.jersey.health.insurance.binding.DcSummary;
import in.atos.jersey.health.insurance.binding.Education;
import in.atos.jersey.health.insurance.binding.Income;
import in.atos.jersey.health.insurance.binding.PlanSelection;

public interface DcService 
{

	public Long loadCaseNum(Integer appId);
	
	public List<String> getPlanNames();
	
	public Long saveIncomeData(Income income);
	
	public Long saveEducation(Education education);
	
	public Long saveChildren(List<Child> childs);
	
	public DcSummary getSummary(Long caseNumber);

	Long savePlanSelection(PlanSelection planSelection);


}
