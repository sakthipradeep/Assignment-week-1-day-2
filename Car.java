package week1.day2.Assignment;

public class Car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car SWIFT=new Car();
		SWIFT.startCar();
		SWIFT.applyGear();
		SWIFT.applyAcclerate();
		SWIFT.switchONac();
		SWIFT.removeKEYintheCar();
	}
	public void startCar() {
		System.out.println("Car started");
	}
	public void applyGear() {
		System.out.println("Gear applied");

	}
	protected void applyAcclerate() {
		System.out.println("Acclerate applied gradualy");
	}
	protected void switchONac() {
		System.out.println("AC switched ON");
	}
	public void applyBreak() {
		System.out.println("Brak applied");
	}
	private void removeKEYintheCar() {
		System.out.println("key removed");
	}
}
