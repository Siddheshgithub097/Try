package in.atos.jersey.health.insurance.exception;

public class ApplicationValidationException  extends RuntimeException
{
	private String message ;

	public String getMessage() {
		return message;
	}

	public ApplicationValidationException(String message) {
		super();
		this.message = message;
	}

	
	
}
