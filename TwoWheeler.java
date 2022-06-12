package week1.day2.Assignment;

public class TwoWheeler {
	int noofWheels=2;
	short noofMirrors=2;
	long chassisNumber=004352L;
	boolean punctured=true;
	String bikeName="KTM";
	double runningKm=30000d;
public static void main(String[] args) {
		// TODO Auto-generated method stub
TwoWheeler bike=new TwoWheeler();
System.out.println("Number of Bike Wheel is : "+bike.noofWheels);
System.out.println("Number of Mirrors in the bike : "+bike.noofMirrors);
System.out.println("Chassis Last 6 Digit Number of the bike is : "+bike.chassisNumber);
System.out.println("Bike is functured : "+bike.punctured);
System.out.println("Bike Name is : "+bike.bikeName);
System.out.println("Bike runned km : "+bike.runningKm);


}

}
