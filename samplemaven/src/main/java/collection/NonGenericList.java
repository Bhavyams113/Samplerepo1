package collection;

import java.util.ArrayList;
import java.util.List;

public class NonGenericList {

	public static void main(String[] args) {
		List l1 = new ArrayList ();
		l1.add("Hello");
		l1.add('A');
		l1.add(5);
		l1.add(1.2f);
		l1.add(23.183d);
		System.out.println(l1);
		System.out.println(l1.get(2));
		l1.set(3, "Hello World");
		System.out.println(l1);
		System.out.println(l1.indexOf("Hello"));
		System.out.println(l1.lastIndexOf("Hello"));
		l1.remove(2);
		System.out.println(l1);
		System.out.println(l1.contains('A'));
		System.out.println(l1.isEmpty());
		System.out.println(l1.size());
		
	}

}
