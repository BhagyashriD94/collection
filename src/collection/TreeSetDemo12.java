package collection;

import java.util.TreeSet;

public class TreeSetDemo12 {
	public static void main(String[] args) {
		TreeSet t= new TreeSet(new MyComparator12());
		t.add("A");
		t.add(new StringBuffer("ABC"));
		t.add(new StringBuffer("AA"));
		t.add("XX");
		t.add("ABCD");
		t.add("A");

		System.out.println(t);
	}

}
