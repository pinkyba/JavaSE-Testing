
public class TestStudent {

	public static void main(String[] args) {
		
//		Student newStd = new Student(); // create default constructors
//		newStd.rno = 10;
//		System.out.println("Roll no :"+newStd.rno);
		
		Student newStd1 = new Student(1, "Aung", "Ygn"); // create argument constructor
//		System.out.println("Rno: "+ newStd1.rno);
//		System.out.println("Name: "+newStd1.name);
//		System.out.println("Address :"+newStd1.address);
		
		Student s1 = new Student(1, "Aung", "Ygn");
		s1.display();
	}

}
