package in.atos.jersey.health.insurance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import in.atos.jersey.health.insurance.service.OtpService;

@RestController
@RequestMapping("/otp")
public class OtpController {

    @Autowired
    private OtpService otpService;

    // Endpoint to generate OTP
    @PostMapping("/sendOtp")
    public ResponseEntity<String> generateOtp(@RequestParam String contact) {
        String otp = otpService.generateOtp(contact);
        return new ResponseEntity<>("OTP sent to " + contact, HttpStatus.OK);
    }

    // Endpoint to validate OTP
    @PostMapping("/verifyOtp")
    public ResponseEntity<String> validateOtp(@RequestParam String contact, @RequestParam String otp) {
        boolean isValid = otpService.validateOtp(contact, otp);
        if (isValid) {
            return new ResponseEntity<>("OTP is valid", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Invalid OTP", HttpStatus.BAD_REQUEST);
        }
    }
}