package com.java8.examples;

import java.util.ArrayList;
import java.util.List;

public class ForEachDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 List<String> names=new ArrayList<>();
 
 names.add("amit");
 names.add("Nitin");
 names.add("sabbir");
 names.add("richard");
 
 names.forEach((name)->{
	 
	 System.out.println(name);
 });
 
 
 
	/*
	 * for(String name:names) {
	 * 
	 * 
	 * }
	 */
 
 
	}

}
