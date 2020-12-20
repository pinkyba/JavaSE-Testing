package pkg1;

public class Employee {

	private int empId;
	private String name;
	private String gender;
	private String password;
	
	//In order to access private variable from another class, it must build getter/setter method
	public void setEmpId(int id) {
		empId = id;
	}
	public void setName(String name) {
		this.name = name.toUpperCase();
	}
	public int getEmpId() {
		return empId;
	}
	public String getName() {
		String newName = "";
		if(gender.equals("male"))
			newName = "Mr. "+name;
		else if(gender.equals("female"))
			newName = "MS. "+name;
		return newName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPassword() {
		password = password.replace("a", "*");
		password = password.replace("b", "*");
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}

