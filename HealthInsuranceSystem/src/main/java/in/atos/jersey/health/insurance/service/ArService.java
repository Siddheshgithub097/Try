package in.atos.jersey.health.insurance.service;

import java.util.List;

import org.springframework.stereotype.Service;

import in.atos.jersey.health.insurance.binding.CitizenApp;

@Service
public interface ArService 
{
	public Long createApplication(CitizenApp citizenApp);

	public boolean updateApplication(Integer appId, CitizenApp application);

	public CitizenApp getApplication(Integer appId);

	public boolean deleteApplication(Integer appId);

	public List<CitizenApp> listAllApplications();
	
}
