
public class StudentTesting {
public static void main(String[] args) {
	Student s = new Student();
	try {
		
		s.mark = 120;
		s.rno = 1;
		s.name = "Aung Aung";
		//call exception 
		s.checkMark();
		
		System.out.println("Valid Mark.");
	}
	catch(InvalidMarkException e) {
		System.out.println("Mark must be 0 and 100");
		System.out.println("Your mark: "+s.mark);
	}
}
}
