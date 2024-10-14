package in.atos.jersey.health.insurance.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "DC_CASES")
public class DcCaseEntity 
{
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer caseid ;
	private Long caseNum;
	private Integer appId;
	private Integer planId;
	public Integer getCaseid() {
		return caseid;
	}
	public void setCaseid(Integer caseid) {
		this.caseid = caseid;
	}
	public Long getCaseNum() {
		return caseNum;
	}
	public void setCaseNum(Long caseNum) {
		this.caseNum = caseNum;
	}
	public Integer getAppId() {
		return appId;
	}
	public void setAppId(Integer appId) {
		this.appId = appId;
	}
	public Integer getPlanId() {
		return planId;
	}
	public void setPlanId(Integer planId) {
		this.planId = planId;
	}
	
	
}
