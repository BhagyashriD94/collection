package collection;

import java.util.TreeSet;

public class TreeSetDemo2 {
	public static void main(String[] args) {
		TreeSet t= new TreeSet(new MyComparator1());
		t.add("Roja");
		t.add("shobharani");
		t.add("Rajakumari");
		t.add("Gangabhwani");
		t.add("Ramulamma");
		System.out.println(t);
	}

}
