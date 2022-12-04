
public class engine {

	int engineno;
	String enginename;
	
	
	public engine(int engineno, String enginename) {
		super();
		this.engineno = engineno;
		this.enginename = enginename;
	}



	public engine() {
		super();
		// TODO Auto-generated constructor stub
	}



	public void displayengine() {
		System.out.println("engine no."+engineno);
		System.out.println("engine name "+enginename);
		
	}
	
}
