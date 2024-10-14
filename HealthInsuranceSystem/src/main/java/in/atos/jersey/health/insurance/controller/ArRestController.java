package in.atos.jersey.health.insurance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.atos.jersey.health.insurance.binding.CitizenApp;
import in.atos.jersey.health.insurance.exception.ApplicationNotFoundException;
import in.atos.jersey.health.insurance.service.ArService;
//application register module 

@RestController 
@RequestMapping("/app")
public class ArRestController {

    @Autowired
    private ArService service;
    
    // application register page 
    
    @PostMapping("/")
    public ResponseEntity<String> createCitizenApp(@RequestBody CitizenApp app) {
        Long appId = service.createApplication(app);
        
        if (appId > 0) {
            return new ResponseEntity<>("App Created with App Id: " + appId, HttpStatus.CREATED);
        } else {
            throw new ApplicationNotFoundException("Invalid SSN");
        }
    }
    
    @PutMapping("/{appId}")
    public ResponseEntity<String> updateApplication(@PathVariable Integer appId, @RequestBody CitizenApp application) {
        boolean isUpdated = service.updateApplication(appId, application);
        if (isUpdated) {
            return new ResponseEntity<>("Application updated successfully.", HttpStatus.OK);
        } else {
            throw new ApplicationNotFoundException("Application not found.");
        }
    }

    @GetMapping("/{appId}")
    public ResponseEntity<CitizenApp> getApplication(@PathVariable Integer appId) {
        CitizenApp application = service.getApplication(appId);
        if (application != null) {
            return new ResponseEntity<>(application, HttpStatus.OK);
        } else {
            throw new ApplicationNotFoundException("Application not found.");
        }
    }

    @DeleteMapping("/{appId}")
    public ResponseEntity<String> deleteApplication(@PathVariable Integer appId) {
        boolean isDeleted = service.deleteApplication(appId);
        if (isDeleted) {
            return new ResponseEntity<>("Application deleted successfully.", HttpStatus.OK);
        } else {
            throw new ApplicationNotFoundException("Application not found.");
        }
    }

    @GetMapping("/")
    public ResponseEntity<List<CitizenApp>> listAllApplications() {
        List<CitizenApp> applications = service.listAllApplications();
        return new ResponseEntity<>(applications, HttpStatus.OK);
    }
}