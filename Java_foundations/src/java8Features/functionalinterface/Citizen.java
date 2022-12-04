package java8Features.functionalinterface;

public class Citizen implements BikeLicense,CarLicense{
	
	@Override
	public void visitRTO() {
		// TODO Auto-generated method stub
		System.out.println("visited RTO for bike ");
		
	}

	@Override
	public void visitRTO(String a) {
		BikeLicense.super.applyLLR();
		System.out.println("visited RTO for Car ");
	}

	
	public void applyLLR() {
	
		System.out.println("both license applied");
		
	}

	
	
}
