package com.java.playground;

public class SubClass extends BaseClass{

	public SubClass(String name) {
		super(name);
		System.out.println("I am subclass constructor");
	}
	
	@Override
	public void run() {
		System.out.println("I can run too");
	}
	
	public void sayHello() {
		super.breath();
		System.out.println("I just breathed out, hello! ");
	}

}
