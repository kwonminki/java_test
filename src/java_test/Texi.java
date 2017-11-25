package java_test;

public class Texi extends Car {
	private String texiNumber;
	private int passengerCount;
	
	public Texi(){
		
	}
	
	public Texi(String carName, String carNumber, int carPrice){
		super(carName, carNumber, carPrice);
	}

	public String getTexiNumber() {
		return texiNumber;
	}

	public void setTexiNumber(String texiNumber) {
		this.texiNumber = texiNumber;
	}

	public int getPassengerCount() {
		return passengerCount;
	}

	public void setPassengerCount(int passengerCount) {
		this.passengerCount = passengerCount;
	}
	
	public void getCarInfo(){
		super.getCarInfo();
		
		System.out.println("Texi Nuber: "+this.getTexiNumber());
		System.out.println("Texi PassengerCount: "+this.getPassengerCount());
	}
	
}
