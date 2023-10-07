package sortedmap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionSortDemo2 {

	public static void main(String[] args) {
		ArrayList l=new ArrayList();
		l.add("Z");
		l.add("A");
		l.add("K");
		l.add("L");
		System.out.println("Before sorting:"+l);
		Collections.sort(l,new MyComparator21());
		System.out.println("After sorting:"+l);

	}

}
class MyComparator21 implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		String s1=(String)o1;
		String s2=o2.toString();
		return s2.compareTo(s1);
	}
	
}