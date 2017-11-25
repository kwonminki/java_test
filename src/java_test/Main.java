package java_test;

public class Main {
	public static void main(String args[]){
	/*	Car myCar = new Car();
		
		myCar.setCarName("Sonata");
		myCar.setCarNumber("8383");
		myCar.setCarPrice(1000);
		
		System.out.println("object :"+myCar);
		myCar.getCarInfo();
	*/
		Bus myBus = new Bus("minibus","2314",4000);
		
		myBus.setBusNumber("Bus123414");
		myBus.setPassengerCount(70);
		
		System.out.println("object value: "+myBus);
		myBus.getCarInfo();
		
		Texi myTexi = new Texi("minitexi","cdf2525",1500);
		
		myTexi.setTexiNumber("dkdk34");
		myTexi.setPassengerCount(50);
		
		System.out.println("Object: "+myTexi);
		myTexi.getCarInfo();
		System.out.println("===============================");
	}
}
