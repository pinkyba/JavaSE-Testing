
public class Employee {
private int empId;
private String name;
private int salary;

public Employee() {
	
}
public Employee(int id, String name, int salary) {
	empId = id;
	this.name = name;
	this.salary = salary;
			
}
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}

}
