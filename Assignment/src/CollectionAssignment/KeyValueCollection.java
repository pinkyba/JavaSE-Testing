package CollectionAssignment;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class KeyValueCollection {
public static void main(String[] args) {
	HashMap <Integer, Student> map = new HashMap<Integer, Student>();
	
	Scanner sc = new Scanner(System.in);
	for(int i=0; i<5; i++) {
		Student s = new Student();
		System.out.print("Enter roll no: ");
		s.setRno(sc.nextInt());
		sc.nextLine();
		System.out.print("Enter name: ");
		s.setName(sc.nextLine());
		
		map.put(s.getRno(), s);
	}
	
	// Sorting HashMap based on key
	Map<Integer, Student> sort = new TreeMap<Integer, Student>(map);
	
	Set<Integer> keyList = sort.keySet();
	
	System.out.println("-------Sorted Student List-------");
	for(Integer key: keyList) {
		System.out.print("Roll no: "+sort.get(key).getRno()+" -> ");
		System.out.print("name: "+sort.get(key).getName());
		System.out.println();
	}
	
	System.out.print("Enter roll no you want to search: ");
	int roll = sc.nextInt();
	boolean isFound = false;
	sc.nextLine();
	for(Integer key: keyList) {
		if(sort.get(key).getRno() == roll) {
			System.out.println("Roll no "+roll+" is "+sort.get(key).getName());
			isFound = true;
		}
	}
	if (isFound == false) {
		System.out.println("Roll no "+roll+" is not found.");
	}
	
	System.out.print("Enter roll no you want to delete: ");
	roll = sc.nextInt();
	sc.nextLine();
	isFound = false;
	for(Integer key: keyList) {
		if(sort.get(key).getRno() == roll) {
			sort.remove(key);
			isFound = true;
		}
	}
	Set<Integer> keyList1 = sort.keySet();
	if (isFound == true) {
	System.out.println("-----Removed Student List-------");
	for(Integer key: keyList1) {
		System.out.print("Roll no: "+sort.get(key).getRno()+" -> ");
		System.out.print("name: "+sort.get(key).getName());
		System.out.println();
		
	}
	}else{
		System.out.println("Roll no "+roll+" is not found to delete.");
		}
 	}
}
