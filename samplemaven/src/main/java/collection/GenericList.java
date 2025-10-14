package collection;

import java.util.ArrayList;
import java.util.List;

public class GenericList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <String> l1 = new ArrayList <String>();
		l1.add("Apple");
		l1.add("Mango");
		l1.add("Pineapple");
		l1.add("Grapes");
		l1.add("Apple");
		System.out.println(l1);
		System.out.println(l1.get(2));
		l1.set(3, "Orange");
		System.out.println(l1);
		System.out.println(l1.indexOf("Apple"));
		System.out.println(l1.lastIndexOf("Apple"));
		l1.remove(2);//l1.remove("Apple");
		System.out.println(l1);
		System.out.println(l1.contains("Mango"));
		System.out.println(l1.isEmpty());
		System.out.println(l1.size());

	}

}
