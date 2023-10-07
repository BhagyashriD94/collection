package sortedmap;

import java.util.TreeMap;

public class TreeMapDemo3 {
	public static void main(String[] args) {
		TreeMap m=new TreeMap();
		m.put(100, "AAA");
		m.put(103, "BBB");
		m.put(101, "CCC");
		m.put(104, 106);
//		m.put("FFFF", "AAA");
//		m.put(null, "BBB");
		
		System.out.println(m);
	}

}
