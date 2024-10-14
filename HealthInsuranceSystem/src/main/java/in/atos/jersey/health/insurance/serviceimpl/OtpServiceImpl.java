package in.atos.jersey.health.insurance.serviceimpl;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.springframework.stereotype.Service;

import in.atos.jersey.health.insurance.service.OtpService;

@Service
public class OtpServiceImpl implements OtpService {

	private final Map<String, String> otpStore = new HashMap<>();
	
	@Override
	public String generateOtp(String contact) 
	{
		String otp = String.valueOf(new Random().nextInt(900000) + 100000); 
		otpStore.put(contact, otp);
		System.out.println("OTP sent to " + contact + ": " + otp); // Placeholder for sending OTP
        return otp;
    }


	 @Override
	    public boolean validateOtp(String contact, String otp)
	 	{
	        return otp.equals(otpStore.get(contact)); // Validate the OTP
	    }

}
