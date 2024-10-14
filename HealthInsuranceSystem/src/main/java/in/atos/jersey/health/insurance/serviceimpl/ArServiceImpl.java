package in.atos.jersey.health.insurance.serviceimpl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import in.atos.jersey.health.insurance.binding.CitizenApp;
import in.atos.jersey.health.insurance.entity.CitizenAppEntity;
import in.atos.jersey.health.insurance.exception.ApplicationValidationException;
import in.atos.jersey.health.insurance.repository.CitizenAppRepository;
import in.atos.jersey.health.insurance.service.ArService;

@Service
public class ArServiceImpl implements ArService {

    @Autowired
    private CitizenAppRepository appRepository;

    @Override
    public Long createApplication(CitizenApp app) 
    {
       
        validateCitizenApp(app);

   
   /*     String stateName = "New Jersey";  
       
        if(!"New Jersey".equals(stateName)) {
            throw new ApplicationValidationException("Application is only accepted from New Jersey.");
        }

      */
        
        String stateName = app.getStateName();
        // i want to varify statename is new jersey or not ? 
        
        if(!"New Jersey".equalsIgnoreCase(stateName)) 
        {
        	throw new ApplicationValidationException("Application is only accepted from New Jersey.");
        }
        CitizenAppEntity appEntity = new CitizenAppEntity();
        BeanUtils.copyProperties(app, appEntity);
        appEntity.setStateName(stateName);

        try {
          
            CitizenAppEntity savedEntity = appRepository.save(appEntity);
            return savedEntity.getAppId() ;
        } catch (DataIntegrityViolationException e) {
            throw new ApplicationValidationException("Data integrity violation: " + e.getMessage()); // i am @unique declare on email 
        } catch (Exception e) {
            
            throw new ApplicationValidationException("Failed to create application: " + e.getMessage());
        }
    }

    
    
    // Method to validate required fields
    private void validateCitizenApp(CitizenApp app) {
        if (app.getFullname() == null || app.getFullname().isEmpty()) {
            throw new ApplicationValidationException("Full name is required.");
        }
        if (app.getEmail() == null || app.getEmail().isEmpty()) {
            throw new ApplicationValidationException("Email is required.");
        }
        if (app.getPhnno() == null) {
            throw new ApplicationValidationException("Phone number is required.");
        }
        if (app.getDob() == null) {
            throw new ApplicationValidationException("Date of birth is required.");
        }
        if (app.getSsn() == null || !isValidSSN(app.getSsn())) {
            throw new ApplicationValidationException("Invalid SSN. It must be 9 digits or in the format AAA-GG-SSSS.");
        }
        validateEmail(app.getEmail());
    }

    
    private boolean isValidSSN(String ssn)
    {
        // Check if SSN is either 9 digits or in the format AAA-GG-SSSS
        return ssn.matches("\\d{9}") || ssn.matches("\\d{3}-\\d{2}-\\d{4}");
    }
    
    
    private void validateEmail(String email) {
        // Regex pattern for valid Gmail and Yahoo email validation with only one '@' allowed
        String emailRegex = "^[A-Za-z0-9._%+-]+@(gmail\\.com|yahoo\\.com)$";

        if (email == null || !email.matches(emailRegex)) {
            throw new ApplicationValidationException("Invalid email format. Only Gmail and Yahoo emails are accepted.");
        }
    }



    @Override
    public boolean updateApplication(Integer appId, CitizenApp application) {
        // Validate the input
        validateCitizenApp(application);
        
        // Find the existing application
        CitizenAppEntity existingAppEntity = appRepository.findById(appId)
                .orElseThrow(() -> new ApplicationValidationException("Application not found with appId: " + appId));

        // Copy properties from the incoming application to the existing entity
        BeanUtils.copyProperties(application, existingAppEntity, "appId"); // Exclude appId from being overwritten

        try {
            appRepository.save(existingAppEntity);
            return true; // Indicate the update was successful
        } catch (DataIntegrityViolationException e) {
            throw new ApplicationValidationException("Data integrity violation: " + e.getMessage());
        } catch (Exception e) {
            throw new ApplicationValidationException("Failed to update application: " + e.getMessage());
        }
    }
    

    @Override
    public CitizenApp getApplication(Integer appId) {
        CitizenAppEntity appEntity = appRepository.findById(appId)
                .orElseThrow(() -> new ApplicationValidationException("Application not found with appId: " + appId));

        CitizenApp citizenApp = new CitizenApp();
        BeanUtils.copyProperties(appEntity, citizenApp);
        return citizenApp;
    }

    @Override
    public boolean deleteApplication(Integer appId) {
        CitizenAppEntity appEntity = appRepository.findById(appId)
                .orElseThrow(() -> new ApplicationValidationException("Application not found with appId: " + appId));

        try {
            appRepository.delete(appEntity);
            return true; // Indicate the deletion was successful
        } catch (Exception e) {
            throw new ApplicationValidationException("Failed to delete application: " + e.getMessage());
        }
    }

    @Override
    public List<CitizenApp> listAllApplications() {
        List<CitizenAppEntity> appEntities = appRepository.findAll();
        return appEntities.stream()
                .map(entity -> {
                    CitizenApp citizenApp = new CitizenApp();
                    BeanUtils.copyProperties(entity, citizenApp);
                    return citizenApp;
                })
                .collect(Collectors.toList());
    }
}