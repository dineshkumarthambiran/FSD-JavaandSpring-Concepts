package ExceptionHandling;

public class idnotFound extends Exception {
	
	String message ;

	public idnotFound(String message) {

		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	@Override
	public String toString() {
		return  message;
	}

	
	
	

}
