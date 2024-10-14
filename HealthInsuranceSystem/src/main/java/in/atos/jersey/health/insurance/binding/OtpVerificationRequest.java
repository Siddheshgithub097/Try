package in.atos.jersey.health.insurance.binding;

public class OtpVerificationRequest 
{
	private String contact; // Email or mobile number
    private String otp; // OTP provided by the user
    private CitizenApp citizenApp ;
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getOtp() {
		return otp;
	}
	public void setOtp(String otp) {
		this.otp = otp;
	}
	public CitizenApp getCitizenApp() {
		return citizenApp;
	}
	public void setCitizenApp(CitizenApp citizenApp) {
		this.citizenApp = citizenApp;
	}
    
    
    
}
