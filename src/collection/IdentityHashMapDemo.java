package collection;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashMapDemo {
	public static void main(String[] args) {
		IdentityHashMap m=new IdentityHashMap();
		Integer i1=new Integer(10);
		Integer i2=new Integer(10);
		 m.put(i1,"raja");
		 m.put(i2, "ram");
		 System.out.println(m);
	}

}
