
import java.util.Scanner;

public class JavaWrapperClass {
	public static void main(String[] args) {
		String tmp = "1000";
		int i = Integer.parseInt(tmp);
		System.out.println(i);
		
		String t = "12.3";
		float f = Float.parseFloat(t);
		
		//create float object
		Float floatObj = new Float(13.2); 
		
		// normal object can change normal value
		Student std = new Student(); // normal object
		std.setRno(200);
		System.out.println("Rno: "+std.getRno());
		changeData(std);
		System.out.println("Rno: "+std.getRno());
		
		//wrapper class object cannot change normal value
		Integer j = new Integer(1); // wrapper object
		System.out.println("j= "+j);
		editData(j);
		System.out.println("J= "+j);
	}
	
static void changeData(Student s) {
	s.setRno(100);
}
static void editData(Integer i) {
	i =3;
}
}
