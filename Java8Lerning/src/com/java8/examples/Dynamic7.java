package com.java8.examples;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

public class Dynamic7 {
	
	
	
	
	

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		MethodHandles.Lookup methodHandler=MethodHandles.lookup();
		MethodHandle methodHandlec=	methodHandler.findVirtual(FirstExample.class, "x", MethodType.methodType(void.class));
		
		MethodHandle methodHandlecstatic=	methodHandler.findVirtual(FirstExample.class, "y", MethodType.methodType(void.class));
		
		FirstExample fc=new FirstExample();
		
		methodHandlec.invoke(fc);
		
		
		methodHandlecstatic.invoke();
		
		
		
	}

}
