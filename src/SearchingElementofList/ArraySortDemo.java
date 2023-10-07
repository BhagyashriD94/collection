package SearchingElementofList;

import java.util.Arrays;
import java.util.Comparator;

public class ArraySortDemo {

	public static void main(String[] args) {
		int[]a= {10,5,20,11,6};
		System.out.println("primitive Array before sorting");
		for(int a1:a) {
			System.out.println(a1);
		}
		Arrays.sort(a);
		System.out.println("primitive Array after sorting");
		for(int a1:a) {
			System.out.println(a1);
		}
		String[]s= {"A","Z","B"};
		System.out.println("object Arrays before sorting");
		for(String a2:s) {
			System.out.println(a2);
		}
       Arrays.sort(s);
       System.out.println("object Arrays after sorting");
       for(String a1:s) {
    	   System.out.println(a1);
       }
       Arrays.sort(s,new MyComparator23());
       System.out.println("object Array after sorthing by comparator");
       for(String a1:s) {
    	   System.out.println(a1);
       }
	}
}
class MyComparator23 implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		String s1=o1.toString();
		String s2=o2.toString();
		
		return s2.compareTo(s1);
	}
	
}
