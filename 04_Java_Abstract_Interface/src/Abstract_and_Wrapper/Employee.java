package Abstract_and_Wrapper;
import java.util.Scanner;

public abstract class Employee extends People{

	private int empId;
	private int salary;
	
	@Override
	public void initializeData() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter name: ");
		name = sc.nextLine();
		System.out.print("Enter address: ");
		address = sc.nextLine();
		
	}	
	public abstract void setEmpIdSalary();
	
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

}
