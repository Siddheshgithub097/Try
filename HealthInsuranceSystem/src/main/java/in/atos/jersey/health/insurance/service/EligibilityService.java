package in.atos.jersey.health.insurance.service;

public interface EligibilityService 
{
    boolean checkEligibilityForSNAP(Long appId);
    boolean checkEligibilityForCCAP(Long appId);
    boolean checkEligibilityForMedicaid(Long appId);
    boolean checkEligibilityForMedicare(Long appId);
    boolean checkEligibilityForQHP(Long appId);
}