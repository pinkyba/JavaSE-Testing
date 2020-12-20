package Abstract_and_Wrapper;

import java.util.Scanner;

public class Teacher extends Employee{
	private int empId;
	private int salary;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public void setEmpIdSalary() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter empId: ");
		empId = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter salary: ");
		salary = sc.nextInt();
		sc.nextLine();
	}

	@Override
	public void displayData() {
		
		System.out.println("EmpId: "+empId);
		System.out.println("Name: "+name);
		System.out.println("Address: "+address);
		System.out.println("Salary: "+salary);
	}
	
	// own class of Teacher class
	public void displayCompanyName() {
		System.out.println("MMIT");
	}

}