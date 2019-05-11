package javaProg.Map;

import java.util.TreeMap;

public class TreeMapDemoCustomSort {
	
	public static void main(String[] args) {
		TreeMap tm = new TreeMap(new MyComparator());
		tm.put("XXX",10);
		tm.put("AAA",20);
		tm.put("ZZZ",30);
		tm.put("LLL",40);
		System.out.println(tm);// {101=xxx, 103=yyy, 104=106}
	}

}
