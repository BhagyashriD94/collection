package collection;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {
	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add("Bhagyashri");
		l.add("Anvit");
		l.add("Renu");
		l.add("Priya");
		System.out.println(l);
		ListIterator ltr=l.listIterator();
		while(ltr.hasNext()) {
			String s=(String)ltr.next();
			if(s.equals("Anvit")) {
				ltr.remove();
			}else if(s.equals("Priya")) {
				ltr.add("Anvit");
			}else if(s.equals("Renu")) {
				ltr.set("Manu");
			}
		}
		System.out.println(l);
	}

}
