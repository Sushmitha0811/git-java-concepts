package com.java.stringconcept;

public class StrringFunctions {

	public static void main(String[] args) {

		String s = "Hows is ur day going?";
		System.out.println(s.length());
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		char c[] = s.toCharArray();
		// String c[] = s.split(" ");
		// byte c[] = s.getBytes();
		for (int i = 0; i < c.length; i++)
			System.out.println(c[i]);
		System.out.println(s.substring(3));
		System.out.println(s.substring(3, 6));
		System.out.println(s.indexOf("i"));
		System.out.println(s.indexOf("i", 3));
		System.out.println(s.lastIndexOf("i"));
		System.out.println(s.charAt(3));
		System.out.println(s.codePointAt(3));
		System.out.println(s.replace("is", "day"));
		System.out.println(s.replace("i", "I"));
		String S1 = "Hows is ur day";
		System.out.println(S1.length());
		System.out.println(S1.trim().length());
		System.out.println(s.equals("Hows is ur day"));
		System.out.println(s.compareTo("Hows is ur day"));
		System.out.println(s.equalsIgnoreCase("Hows is ur day"));
		System.out.println();

	}

}
