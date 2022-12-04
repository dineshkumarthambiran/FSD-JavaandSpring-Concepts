package ExceptionHandling.Custom;

public class StudentAlreadyExists extends Exception{
	
	String message ;

	public StudentAlreadyExists(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	@Override
	public String toString() {
		return "StudentAlreadyExists [message=" + message + "]";
	}

	
	
	

}
