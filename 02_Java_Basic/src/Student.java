
public class Student {
	public static int rno;
	public String name;
	public String address;
	
	public Student() {
		System.out.println("This is default constructor.");
	}
	
	public Student(int rno, String name, String address) {
		this.rno = rno;
		this.name = name;
		this.address = address;
	}
	
	public void display() {
		System.out.println("Rno: "+ rno);
		System.out.println("Name: "+name);
		System.out.println("Address :"+address);
	}
	public static void setData() {
		rno = 100;
	}
	public static void main(String[] args) {
		
	}
}
