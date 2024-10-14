package in.atos.jersey.health.insurance.binding;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;

public class CitizenApp 
{
	
	private String fullname;
	
	@Column(unique = true)
	private String email;
	
	@Column(unique = true)
	private Long phnno;
	
	private String gender;
	
	@NotNull(message = "SSN cannot be null")
    private String ssn;	//change
	
	@Past(message = "Date of birth must be in the past")
	private LocalDate dob;

	private String stateName;
	
	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getPhnno() {
		return phnno;
	}

	public void setPhnno(Long phnno) {
		this.phnno = phnno;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	
	
	
}
