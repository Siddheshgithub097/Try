package in.atos.jersey.health.insurance.exception;

public class PlanNotFoundException extends RuntimeException
{
	private String message ;

	
	public PlanNotFoundException(String message) {
		super();
		this.message = message;
	}


	public String getMessage() {
		return message;
	}

	
}