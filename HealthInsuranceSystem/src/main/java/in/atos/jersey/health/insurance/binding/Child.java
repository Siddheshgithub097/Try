package in.atos.jersey.health.insurance.binding;

import java.time.LocalDate;

//dto 

/*  binding package mean it is responsible for data transfer 
and transformation between different layers of your application
 specifically the UI (front-end) and backend (service/database) layers.
*/
public class Child 
{
	private Integer childid	;
	private LocalDate childDob ;
	private Long childSsn;
	private Long caseNum;
	public Integer getChildid() {
		return childid;
	}
	public void setChildid(Integer childid) {
		this.childid = childid;
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


