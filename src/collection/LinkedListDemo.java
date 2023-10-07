package collection;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList  l=new LinkedList();
		l.add("shree");
		l.add(30);
		l.add(null);
		l.add("shree");
		l.set(0,"software");
		l.add(0,"Anvit");
		l.removeLast();
		l.addFirst("ccc");
		System.out.println(l);

	}

}
