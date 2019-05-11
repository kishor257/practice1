package javaProg.Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {

		HashMap<String,Integer> m = new HashMap<>();
		m.put("abhi", 700);
		m.put("golu", 800);
		m.put("molu", 200);
		m.put("nikki", 500);
		System.out.println(m);
		System.out.println(m.put("abhi", 1000));//700
		System.out.println(m);
		
		Set<String> ks = m.keySet();	
		System.out.println(ks);
		
		Collection<Integer> v = m.values();
		System.out.println(v);
		
		Set<Entry<String, Integer>> es = m.entrySet();
		System.out.println(es);
		
		Iterator<Entry<String, Integer>> itr = es.iterator();
		while (itr.hasNext()) {
			Entry<String, Integer> me = itr.next();
			System.out.println(me.getKey()+"\t"+me.getValue());
		}
		Iterator<Entry<String, Integer>> itr1 = es.iterator();
		while (itr1.hasNext()) {
			Map.Entry<String, Integer> me =(Map.Entry) itr1.next();
			System.out.println(me.getKey()+"\t"+me.getValue());
			if (me.getKey().equals("nikki")) {
				me.setValue(10000);
			}
		}
		System.out.println(m);
	}
}
