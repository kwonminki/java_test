package java_test;

public class Bus extends Car {
	private String busNumber;
	private int passengerCount;
	
	public Bus(){}
	public Bus(String carName, String carNumber, int carPrice){
		super(carName, carNumber, carPrice);
	}
	
	public String getBusNumber() {
		return busNumber;
	}
	public void setBusNumber(String busNumber) {
		this.busNumber = busNumber;
	}
	public int getPassengerCount() {
		return passengerCount;
	}
	public void setPassengerCount(int passengerCount) {
		this.passengerCount = passengerCount;
	}
	
	public void getCarInfo(){
		super.getCarInfo();
		
		System.out.println("Bus number: "+this.getBusNumber());
		System.out.println("Bus PassengerCount: "+this.getPassengerCount());
	}
	
	public void etcInfo(){
		System.out.println("bus is big");
	}
	
	
}
