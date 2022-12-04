
public class Carmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		engine engine = new engine(2,"volvo");
		tyre tyre = new tyre(1,"ceat");
		Car car = new Car(engine,tyre,"Audi22","red");
		car.displaycardet();
		
		
		
	}

}
