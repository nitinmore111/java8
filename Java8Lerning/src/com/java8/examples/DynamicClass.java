package com.java8.examples;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class DynamicClass {

	
	
	
	
	
	
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub
		
		Class<FirstExample> firstExample =FirstExample.class;
		
		Constructor<FirstExample>  constref=    firstExample.getConstructor(null);
		FirstExample fc=(FirstExample)constref.newInstance();
		
		
		Method mrthod= firstExample.getMethod("x");
		mrthod.invoke(fc);
		
		
	}

}
