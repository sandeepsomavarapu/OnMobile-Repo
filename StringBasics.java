package com.onmobile.stringex;

public class StringBasics {

	public static void main(String[] args) {

		String name = "onmobile";// immutable
		String name1 = "Onmobile";

		System.out.println(name == name1);// true
		System.out.println(name.equals(name1));// true
		System.out.println(name.compareTo(name1));// 0
		// returns -ve if obj1 has to come before obj2
		// returns +ve if obj1 has to come after obj2
		// returns 0 if objects are same

		System.out.println(name.equalsIgnoreCase(name1));// true
		System.out.println(name.compareToIgnoreCase(name1));// 0

		String name2 = new String("  on   mobile    ");
		String name3 = new String("onmobile");

		System.out.println(name2 == name3);// false
		System.out.println(name2.equals(name3));// true
		System.out.println(name2.compareTo(name3));// 0
		System.out.println(name2.equalsIgnoreCase(name3));// true
		System.out.println(name2.compareToIgnoreCase(name3));// 0

		System.out.println(name2.length());
		System.out.println(name2.trim().length());

		StringBuilder sb = new StringBuilder("onmobile");//muttable
		StringBuilder sb1 = new StringBuilder("onmobile");

		System.out.println(sb == sb1);//false
		System.out.println(sb.equals(sb1));//false ==
		
		sb.append(" hyderabad");
		
		System.out.println(sb);//

	}

}
