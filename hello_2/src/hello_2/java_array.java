package hello_2;
import java.util.Scanner;

public class java_array {

	public static void main(String[] args) {
		int rnoArr[] = new int[5]; //create array
		rnoArr[4] = 100;
		
		String name;
		int rno;
		String address;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter name: ");
		name = sc.nextLine();
		System.out.println("Enter roll no: ");
		rno = sc.nextInt(); 
		sc.nextLine();
		System.out.println("Enter address: ");
		address = sc.nextLine();
		
		System.out.println("--------Student Info-------");
		System.out.println("Rno: "+rno);
		System.out.println("Name: "+name);
		System.out.println("Address: "+address);
	}

}
