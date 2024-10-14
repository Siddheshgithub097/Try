package in.atos.jersey.health.insurance.service;

public interface OtpService 
{
	 String generateOtp(String contact);
	 boolean validateOtp(String contact, String otp);
}
