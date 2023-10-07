package collection;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		
		LinkedHashSet lh=new LinkedHashSet();
		lh.add("B");
		lh.add("C");
		lh.add("D");
		lh.add("Z");
		lh.add(null);
		lh.add(10);
		System.out.println(lh.add("Z"));
		System.out.println(lh);

	}

}
