package in.atos.jersey.health.insurance.exception;

public class CitizenNotFoundException extends RuntimeException
{

	private String message ;

	public CitizenNotFoundException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}


}
