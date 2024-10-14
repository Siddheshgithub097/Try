/*package in.atos.jersey.health.insurance.service;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import in.atos.jersey.health.insurance.binding.CitizenApp;
import in.atos.jersey.health.insurance.entity.CitizenAppEntity;
import in.atos.jersey.health.insurance.exception.ApplicationValidationException;
import in.atos.jersey.health.insurance.repository.CitizenAppRepository;
import in.atos.jersey.health.insurance.serviceimpl.ArServiceImpl;

import java.time.LocalDate;

class ArServiceImplTest {

    @InjectMocks
    private ArServiceImpl arService;

    @Mock
    private CitizenAppRepository appRepository;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testCreateApplication_Success() {
        CitizenApp app = new CitizenApp();
        app.setFullname("John Doe");
        app.setEmail("john@example.com");
        app.setPhnno(1234567890L); // Use Long for phone number
        app.setDob(LocalDate.parse("1990-01-01")); // Use LocalDate
        app.setSsn("123456789");

        CitizenAppEntity savedEntity = new CitizenAppEntity();
        savedEntity.setAppId(1);
        when(appRepository.save(any(CitizenAppEntity.class))).thenReturn(savedEntity);

        Integer appId = arService.createApplication(app);
        assertEquals(1, appId);
    }

    @Test
    void testCreateApplication_InvalidEmail() {
        CitizenApp app = new CitizenApp();
        app.setFullname("John Doe");
        app.setEmail("invalid-email");
        app.setPhnno(1234567890L);
        app.setDob(LocalDate.parse("1990-01-01"));
        app.setSsn("123456789");

        ApplicationValidationException exception = assertThrows(ApplicationValidationException.class, () -> {
            arService.createApplication(app);
        });
        assertEquals("Email is required.", exception.getMessage());
    }

    @Test
    void testCreateApplication_InvalidPhoneNumber() {
        CitizenApp app = new CitizenApp();
        app.setFullname("John Doe");
        app.setEmail("john@example.com");
        app.setPhnno(null); // Invalid phone number (null)
        app.setDob(LocalDate.parse("1990-01-01"));
        app.setSsn("123456789");

        ApplicationValidationException exception = assertThrows(ApplicationValidationException.class, () -> {
            arService.createApplication(app);
        });
        assertEquals("Phone number is required.", exception.getMessage());
    }

    @Test
    void testCreateApplication_InvalidDOB() {
        CitizenApp app = new CitizenApp();
        app.setFullname("John Doe");
        app.setEmail("john@example.com");
        app.setPhnno(1234567890L);
        app.setDob(null); // Invalid DOB (null)
        app.setSsn("123456789");

        ApplicationValidationException exception = assertThrows(ApplicationValidationException.class, () -> {
            arService.createApplication(app);
        });
        assertEquals("Date of birth is required.", exception.getMessage());
    }

    @Test
    void testCreateApplication_InvalidSSN() {
        CitizenApp app = new CitizenApp();
        app.setFullname("John Doe");
        app.setEmail("john@example.com");
        app.setPhnno(1234567890L);
        app.setDob(LocalDate.parse("1990-01-01"));
        app.setSsn("123-45-6789"); // Invalid SSN format

        ApplicationValidationException exception = assertThrows(ApplicationValidationException.class, () -> {
            arService.createApplication(app);
        });
        assertEquals("Invalid SSN. It must be 9 digits or in the format AAA-GG-SSSS.", exception.getMessage());
    }

    @Test
    void testCreateApplication_MissingFullName() {
        CitizenApp app = new CitizenApp();
        app.setFullname(null); // Missing full name
        app.setEmail("john@example.com");
        app.setPhnno(1234567890L);
        app.setDob(LocalDate.parse("1990-01-01"));
        app.setSsn("123456789");

        ApplicationValidationException exception = assertThrows(ApplicationValidationException.class, () -> {
            arService.createApplication(app);
        });
        assertEquals("Full name is required.", exception.getMessage());
    }

    @Test
    void testCreateApplication_InvalidSSN_TooShort() {
        CitizenApp app = new CitizenApp();
        app.setFullname("John Doe");
        app.setEmail("john@example.com");
        app.setPhnno(1234567890L);
        app.setDob(LocalDate.parse("1990-01-01"));
        app.setSsn("12345678"); // SSN too short

        ApplicationValidationException exception = assertThrows(ApplicationValidationException.class, () -> {
            arService.createApplication(app);
        });
        assertEquals("Invalid SSN. It must be 9 digits or in the format AAA-GG-SSSS.", exception.getMessage());
    }

    @Test
    void testCreateApplication_InvalidSSN_TooLong() {
        CitizenApp app = new CitizenApp();
        app.setFullname("John Doe");
        app.setEmail("john@example.com");
        app.setPhnno(1234567890L);
        app.setDob(LocalDate.parse("1990-01-01"));
        app.setSsn("1234567890"); // SSN too long

        ApplicationValidationException exception = assertThrows(ApplicationValidationException.class, () -> {
            arService.createApplication(app);
        });
        assertEquals("Invalid SSN. It must be 9 digits or in the format AAA-GG-SSSS.", exception.getMessage());
    }
    
    // Add more test cases for other validations...
}
*/