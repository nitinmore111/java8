package com.java8.examples;

public class StringExample {
	
	
	public static void main(String[] args) {
		
		
		String sample=new String("Nitin");
		
	  String sample1=sample.concat("More");
		
		System.out.println("print orgin="+sample);
		System.out.println("after concatination="+sample1);
		
		
		StringBuffer sample2=new StringBuffer("Nitin");
		
		     sample2.append("More");
			
			System.out.println("print orgin sample2="+sample2);
			//System.out.println("after concatination="+sample1);
	}

}
