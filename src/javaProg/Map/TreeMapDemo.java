package javaProg.Map;

import java.util.TreeMap;

public class TreeMapDemo {
	
	public static void main(String[] args) {
		TreeMap tm = new TreeMap();
		tm.put(101, "zzz");
		tm.put(103, "yyy");
		tm.put(101, "xxx");
		tm.put(104, 106);
		//tm.put("fff", "xxx");//ClassCastException
		//tm.put(null, "xxx");//NullPointerException
		System.out.println(tm);
	}
}
