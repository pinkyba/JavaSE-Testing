import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class HashMapWithCustomObject {
public static void main(String[] args) {
	HashMap<Integer, Employee> map = new HashMap<>();
	
	
	Scanner sc = new Scanner(System.in);
	for (int i=0; i<3; i++) {
		Employee e = new Employee();
		System.out.println("Enter empId: ");
		e.setEmpId(sc.nextInt());
		sc.nextLine();
		System.out.println("Enter name: ");
		e.setName(sc.nextLine());
		System.out.println("Enter salary: ");
		e.setSalary(sc.nextInt());
		sc.nextLine();
		map.put(e.getEmpId(), e);			
	}
	
	// execute key list
	Set<Integer> keyList = map.keySet();
	System.out.println("-----Employee List------");
	for(Integer key: keyList) {
		System.out.print("EmpId: "+map.get(key).getEmpId()+"{");
		System.out.print("Name= "+map.get(key).getName()+", ");
		System.out.print("Salary= "+map.get(key).getSalary()+"}");
		System.out.println();
	}
}
}
