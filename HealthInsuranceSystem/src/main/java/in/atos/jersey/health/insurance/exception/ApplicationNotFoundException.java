package in.atos.jersey.health.insurance.exception;

public class ApplicationNotFoundException extends RuntimeException 
{
	private String message ;	
	
	public ApplicationNotFoundException(String message) 
	{
		super(message);
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	
	
	
	
}
