import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GenericArrayList {
public static void main(String[] args) {
	ArrayList<String> list = new ArrayList<String>();
	list.add("Su Su");
	list.add("Aung Aung");
	
	String names[] = {"Hla Hla","Thida","Nilar","Moe Moe"};
	
	// change names array to list
	List<String> lst = Arrays.asList(names);
	// List<interface. => ArrayList extends List => add is ArrayList method
	
	list.addAll(lst);
	System.out.println(list);
	
	if(list.contains("Thida")) {
		System.out.println("It exit.");
		//list.remove("Thida");
		list.set(3, "Kyipyar");
	}
	else {
		System.out.println("It is not exit");
	}
	System.out.println(list);
	Collections.sort(list);
	System.out.println(list);
}
}
