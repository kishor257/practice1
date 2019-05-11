package backwardTraversing;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.ListIterator;

public class ReverseAList {

	public static void main(String[] args) {

		ArrayList<String> al=new ArrayList<String>();
		al.add("india");
		al.add("africa");
		al.add("america");
		al.add("bhutan");
		al.add("bangladesh");
		al.add("nepal");
		al.add("zimbawe");
		al.add("new zealand");
		
		//1. traversing in forward direction using for-loop
		for (int i = 0; i++<al.size()-1;) {
			System.out.println(al.get(i));
		}

		//1. using reversed for-loop
		System.out.println("using reverse for-loop");
		for (int i = al.size(); i-->0;) {
			System.out.println(al.get(i));
		}
		//2. using list iterator
		System.out.println("using list iterator");
		ListIterator ltr = al.listIterator(al.size());
		while (ltr.hasPrevious()) {
			Object prev = ltr.previous();
			System.out.println(prev);	
		}	
		//3. using reverse method
		System.out.println("using list iterator");
		Collections.reverse(al);
		System.out.println(al);
	} 
}
