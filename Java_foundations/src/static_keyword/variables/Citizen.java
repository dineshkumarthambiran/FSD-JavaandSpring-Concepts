package static_keyword.variables;

public class Citizen {
	
	int citizenId;
	int citAge;
	String citName;
	static String Nationality="Indian";
	
	public Citizen(int citizenId, int citAge, String citName) {
		super();
		this.citizenId = citizenId;
		this.citAge = citAge;
		this.citName = citName;
	}
	
	public void displayDet()
	
	{
		System.out.println(citizenId);
		System.out.println(citAge);
		System.out.println(citName);
		System.out.println(Nationality);
		
		
		
	}
	
	public static void main(String[] args) {
		
		Citizen user1 = new Citizen(123,19,"dinesh");
		user1.displayDet();
	}
	
	
	

}
