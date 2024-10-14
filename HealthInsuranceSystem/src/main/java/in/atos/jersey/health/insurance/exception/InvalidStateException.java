package in.atos.jersey.health.insurance.exception;

public class InvalidStateException extends RuntimeException 
{
	private String message ;

	public InvalidStateException(String message)
	{
		super(message);
		this.message = message;
	}
	
	
	
	public String getMessage()
	{
		return message;
	}
	
}
