package org.example.designpatterns2.singleton;

public class SingletonLazy {
	private static SingletonLazy instance;
	
	private SingletonLazy() {
		//private constructor for singleton
	}
	
	public static SingletonLazy getInstance() {
		if(instance == null) {
			instance = new SingletonLazy();
		}
		return instance;
	}
	
	public void printMessage() {
		 System.out.println("I'm a lazy singleton:)");
	}

}
