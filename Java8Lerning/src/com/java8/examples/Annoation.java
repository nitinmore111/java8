package com.java8.examples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Annoation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<Integer> list=new ArrayList<>();
		
		list.add(10);
		list.add(101);
		list.add(102);
		list.add(103);
		list.add(104);
		
		
		List<Integer> listeven=list.stream().filter(i->i%2==0).collect(Collectors.toList());
		
		System.out.println(listeven);
		
		ArrayList<Integer> marks=new ArrayList<>();
		marks.add(30);
		marks.add(20);
		marks.add(50);
		marks.add(70);
		marks.add(10);
		marks.add(00);
		
		List maplist=marks.stream().map(i->i+5).collect(Collectors.toList());
		
		System.out.println("maplist"+maplist);
		
		
		
	}

}
