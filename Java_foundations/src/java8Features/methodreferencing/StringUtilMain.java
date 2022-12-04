package java8Features.methodreferencing;

import java.util.function.Consumer;

public class StringUtilMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Consumer <String> consumer1 = StringUtility::new; 
		consumer1.accept("this is constructor");
	}

}
