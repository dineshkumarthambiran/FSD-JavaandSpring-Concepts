package java8Features.functionalinterface;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class ConsumerandSupplier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Supplier<Double> supplier = ()-> Math.random()*100;
		Consumer<Double> consumer = (val)->System.out.println(val);
		
		for (int i =0;i<100;i++)
			
		{
			double random = supplier.get();
			consumer.accept(random);
			
			}

	}

}
