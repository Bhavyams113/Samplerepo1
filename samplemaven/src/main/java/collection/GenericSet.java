package collection;

import java.util.HashSet;
import java.util.Set;

public class GenericSet {

	public static void main(String[] args) {
		Set <String> s = new HashSet <String>();
		s.add("Red");
		s.add("Green");
		s.add("Blue");
		s.add("Black");
		System.out.println(s);
		Set <String> s1 = new HashSet <String> ();
		s1.add("Yellow");
		s1.add("White");
		System.out.println(s1);
		s.addAll(s1);
		System.out.println(s);
		System.out.println(s.contains("White"));
		System.out.println(s1.containsAll(s));
		System.out.println(s1.isEmpty());
		s.remove("White");
		System.out.println(s);
		s.removeAll(s1);
		System.out.println(s);
		System.out.println(s1.size());
		s1.clear();
	System.out.println(s1);
		
	}

}
