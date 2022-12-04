package java8Features.functionalinterface;

public interface BikeLicense {
	
	void visitRTO(String a);
	
	default void applyLLR() {
		System.out.println("bike license applied");
	}

}
