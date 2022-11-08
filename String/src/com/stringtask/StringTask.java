package com.stringtask;

public class StringTask {
	
	public static void main(String[] args) {
		
		/// String is final
		String s="sundar";  // String literal - value in a constant pool
		String s1 =new String("sundar"); // value stored in a constant pool and non pool 
		
		String s2="sundar";
		String s3="sundar";
		
		
		System.out.println(s1.concat("rajan"));
		System.out.println(s.lastIndexOf('d'));
		
		String n= s1.concat("rajan");
		System.out.println(n);
		
		System.out.println(n.charAt(10));
	}

}
