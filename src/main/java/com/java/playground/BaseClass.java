package com.java.playground;

public class BaseClass {
	
	private String name;
	
	public BaseClass(String name) {
		System.out.println("Hello "+name);
		this.think();
		this.name = name;
	}
	
	public void run() {
		System.out.println("I can run");
	}
	
	protected void breath() {
		System.out.println("I can breath from base class");
	}
	
	private void think() {
		System.out.println("I can think but you can't know");
	}
	
	public void sayHello() {
		System.out.println("Hello Mr. / Mrs. "+name);
	}
}
