package week1.day2.Assignment;

public class EmployeeDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeDetails employee=new EmployeeDetails();

		System.out.println(employee.emplyeeName());
		System.out.println(employee.employeeId());
		System.out.println(employee.employeeADDress());
		System.out.println(employee.employeeSalary());
		System.out.println(employee.employeePHONENumber());
	}
	public String emplyeeName() {
		String name="BEN";
		return name;
	}
	public int employeeId() {
		int id=555;
		return id;
	}
	public String employeeADDress() {
		String address=" Nesamani Ponnaya Street chennai ";
		return address;
	}
	public double employeeSalary() {
		double salary=35000;
		return salary;
	}
	public long employeePHONENumber() {
		long number=1234567890;
		return number;
	}
}