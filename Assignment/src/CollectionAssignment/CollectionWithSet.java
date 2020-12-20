package CollectionAssignment;

import java.util.*;

public class CollectionWithSet {
	
	private static final String ArrayUtils = null;

	public static void main(String[] args) {
		Set<Student> hashSet = new HashSet<Student>(); 
		
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<5; i++) {
			Student s = new Student();
			System.out.print("Enter roll no: ");
			s.setRno(sc.nextInt());
			sc.nextLine();
			System.out.print("Enter name: ");
			s.setName(sc.nextLine());
			hashSet.add(s);
		}
		
		// change hash set to array
		Student[] arr = hashSet.toArray( new Student[hashSet.size()] );
		
		System.out.println("------Student List-------");
		for (int i=0; i<arr.length; i++) {
			System.out.print("Roll no: "+arr[i].getRno());
			System.out.print(" Name: "+arr[i].getName());
			System.out.println();
		}
		
		System.out.println("------Sorted Student List--------");
		int tmp;
		String tmpName;
        for (int i=0; i<arr.length; i++) {
        	if(i < arr.length-1) {
        	if(arr[i+1].getRno() < arr[i].getRno()) {
        		tmp = arr[i].getRno();
        		tmpName = arr[i].getName();
        		
        		arr[i].setRno(arr[i+1].getRno());
        		arr[i].setName(arr[i+1].getName());
        		
        		arr[i+1].setRno(tmp);
        		arr[i+1].setName(tmpName);
        		
        	}}
        }
        for (int i=0; i<arr.length; i++) {
        	System.out.print("Roll no: "+arr[i].getRno());
        	System.out.println(" Name: "+arr[i].getName());
        }
        System.out.print("Enter roll no you want to search: ");
        int roll = sc.nextInt();
        sc.nextLine();
        for(int i=0; i<arr.length; i++) {
        	if(arr[i].getRno() == roll) {
        		System.out.println("Roll no "+roll+" is "+arr[i].getName());
        	}
        }
        System.out.print("Enter roll no you want to remove: ");
        roll = sc.nextInt();
        sc.nextLine();
        for(int i=0; i<arr.length; i++) {
        	if(arr[i].getRno() == roll) {
        		 arr[i] = null;
        	}
        }
        for(int i=0; i<arr.length; i++) {
        	if (arr[i] != null) {
        	System.out.print("Roll no: "+arr[i].getRno());
        	System.out.println(" Name: "+arr[i].getName());}
        }
    } 
}
