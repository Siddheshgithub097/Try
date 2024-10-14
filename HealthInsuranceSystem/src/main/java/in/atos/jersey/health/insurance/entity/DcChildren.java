package in.atos.jersey.health.insurance.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "DC-CHILDREN")
public class DcChildren 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer childId;
	private LocalDate childDob;
	private Long childSsn;
	private Long caseNum;
	
	public Integer getChildId() {
		return childId;
	}
	public void setChildId(Integer childId) {
		this.childId = childId;
	}
	public LocalDate getChildDob() {
		return childDob;
	}
	public void setChildDob(LocalDate childDob) {
		this.childDob = childDob;
	}
	public Long getChildSsn() {
		return childSsn;
	}
	public void setChildSsn(Long childSsn) {
		this.childSsn = childSsn;
	}
	public Long getCaseNum() {
		return caseNum;
	}
	public void setCaseNum(Long caseNum) {
		this.caseNum = caseNum;
	}
	
	
	
	
}
