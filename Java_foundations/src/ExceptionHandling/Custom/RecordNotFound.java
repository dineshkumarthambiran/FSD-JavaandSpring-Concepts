package ExceptionHandling.Custom;

public class RecordNotFound extends Exception {

	String message ;

	public RecordNotFound(String message) {
	
		this.message = message;
	}
	
	
}
