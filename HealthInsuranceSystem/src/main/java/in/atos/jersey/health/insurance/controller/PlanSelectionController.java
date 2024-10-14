package in.atos.jersey.health.insurance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import in.atos.jersey.health.insurance.entity.PlanMasterEntity;
import in.atos.jersey.health.insurance.service.PlanSelectionService;

@RestController
@RequestMapping("/plans")
public class PlanSelectionController
{
	@Autowired
	private PlanSelectionService planSelectionService;
	
	
	
	@GetMapping("/getavailable")
	public ResponseEntity<List<PlanMasterEntity>> getAvailablePlans()
	{
		List<PlanMasterEntity> plans = planSelectionService.getAvailablePlans();
        return ResponseEntity.ok(plans); 
	}
	
	@PostMapping("/select")
	public ResponseEntity<PlanMasterEntity> selectPlanForCitizen(@RequestParam Long appId, @RequestParam Integer planId)
	{
		PlanMasterEntity plan =  planSelectionService.selectPlanForCitizen(appId, planId) ;
		return ResponseEntity.ok(plan);
	}
	
	 @GetMapping("/eligibility")
	public ResponseEntity<Boolean> isCitizenEligibleForPlan(@RequestParam Long appId, @RequestParam Integer planId)
	 {
		 Boolean iseligible = planSelectionService.isCitizenEligibleForPlan(appId, planId);
		 return ResponseEntity.ok(iseligible);
	 }
	 
	 
}
