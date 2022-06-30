package com.onmobile.collections;

import java.util.ArrayList;
import java.util.Iterator;

//1)not fixed in size growable in nature
//2)both homogeneous & Heterogeneous  data allowed
//3)lots of utility methods
//List :
//4)duplicates are allowed
//5)insertion order is preserved 

public class ListEx {

	public static void main(String[] args) {

		ArrayList<String> names = new ArrayList<String>();// 10,16,25 (cc*3/2)+1

		names.add("sandeep");
		names.add("suresh");
		names.add("naresh");
		names.add(1,"mahesh");
		names.add("rajesh");
		names.add("sandeep");
		System.out.println(names);

		Iterator<String> itr = names.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		

		ArrayList<String> names1 = new ArrayList<String>();

		names1.add("rama");
		names1.add("akash");

		System.out.println(names1.get(1));

		names1.addAll(0,names);

		System.out.println(names1);
		names1.retainAll(names);
		System.out.println(names1);
	}

}
