package com.onmobile.collections;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Mapex {
	public static void main(String[] args) {

		TreeMap<Integer, String> emps = new TreeMap<Integer, String>();
		emps.put(121, "mahesh");// entry
		emps.put(651, "suresh");
		emps.put(821, "naresh");
		emps.put(879, "rajesh");
		emps.put(456, "somesh");
		emps.put(121, "sandeep");

		System.out.println(emps);

		Set<Integer> keys = emps.keySet();

		Iterator<Integer> itr = keys.iterator();

		while (itr.hasNext()) {
			int key = itr.next();
			System.out.println(key + "  " + emps.get(key));

		}
System.out.println("****************************");
		Set<Entry<Integer, String>> entries = emps.entrySet();

		Iterator<Entry<Integer, String>> itr1 = entries.iterator();

		while (itr1.hasNext()) {
			Entry<Integer, String> entries1 = itr1.next();
			System.out.println(entries1.getKey() + "  " + entries1.getValue());

		}

	}
}
