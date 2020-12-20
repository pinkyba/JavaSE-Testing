package Abstract_and_Wrapper;
import java.util.Scanner;

public class Student extends People{

	private int rno;
	private int mark;
	
public int getRno() {
	return rno;
}
public void setRno(int rno) {
	this.rno = rno;
}
public int getMark() {
	return mark;
}
public void setMark(int mark) {
	this.mark = mark;
}
//if Student's parent is abstract, it must provide method body of
//its parent abstract class
public void initializeData() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter rno: ");
		rno = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter name: ");
		name = sc.nextLine();
		System.out.print("Enter address: ");
		address = sc.nextLine();
	}
public void displayData() {
		System.out.println("Rno: "+rno);
		System.out.println("Name: "+name);
		System.out.println("Address: "+address);
	}
}
