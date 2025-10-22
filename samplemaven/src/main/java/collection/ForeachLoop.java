package collection;

import java.util.ArrayList;
import java.util.List;

public class ForeachLoop {

	public static void main(String[] args) {
		List <String> l1 = new ArrayList <String>();
		l1.add("Apple");
		l1.add("Mango");
		l1.add("Pineapple");
		l1.add("Grapes");
		l1.add("Apple");
		for (String b:l1)
		{
			System.out.println(b);
		
		}
		
		
		int a [] = { 5,6,7,8,2};
		for (int b :a)
		{
			System.out.println(b);
		}
	}

}
