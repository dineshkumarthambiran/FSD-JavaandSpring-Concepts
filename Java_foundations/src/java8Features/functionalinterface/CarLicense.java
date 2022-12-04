package java8Features.functionalinterface;

public interface CarLicense {
	
	void visitRTO();

	default void applyLLR() {
		System.out.println("bike license applied");
	}

}
