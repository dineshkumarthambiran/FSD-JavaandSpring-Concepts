package Object_intantiation.interfaces;

public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		bikeLicense bike = new CitizenLicense();
		
		bikeLicense car = new bikeLicense() {
			
			@Override
			public void bikeTest() {
				// TODO Auto-generated method stub
				System.out.println("");
				
			}
			
			@Override
			public void bikeFee() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void applyBikeLLR() {
				// TODO Auto-generated method stub
				
			}
		};
		

	}

}
