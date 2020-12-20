package inheritance_assignment;

public class Testing {
public static void main(String[] args) {
	Employee emp[] = new Employee[5];
	
	for (int i=0; i<5; i++) {
		if(i < 3 ) {
			emp[i] = new Teacher();
		}
		else {
			emp[i] = new Staff();
		}
	}
	
	for (int i=0; i<5; i++) {
		if(i < 3 ) {
			System.out.println("Student data info "+(i+1));
			emp[i].initializeInfo();
		}
		else {
			System.out.println("Staff data info "+(i+1));
			emp[i].initializeInfo();
		}
	}
	
	for (int i=0; i<5; i++) {
		if(i < 3 ) {
			System.out.println("Student data display "+(i+1));
			emp[i].displayInformation();
		}
		else {
			System.out.println("Staff data display "+(i+1));
			emp[i].displayInformation();
		}
	}
}
}
