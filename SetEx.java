package com.onmobile.collections;

import java.util.TreeSet;

//1)not fixed in size growable in nature
//2)both homogeneous & Heterogeneous  data allowed
//3)lots of utility methods
//List :
//4)duplicates are not allowed
//5)insertion order is not preserved 

public class SetEx {

	public static void main(String[] args) {

		TreeSet<String> names = new TreeSet<String>();// 10,16,25 (cc*3/2)+1

		names.add("sandeep");
		names.add("suresh");
		names.add("naresh");
		names.add("mahesh");
		names.add("rajesh");
		names.add("sandeep");
		System.out.println(names);
		

	}

}