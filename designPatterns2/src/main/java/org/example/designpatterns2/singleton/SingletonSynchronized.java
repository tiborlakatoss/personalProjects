package org.example.designpatterns2.singleton;

public class SingletonSynchronized {
	private static SingletonSynchronized instance;
	
	private SingletonSynchronized() {
		//private constructor for singleton
	}
	
	public static SingletonSynchronized getInstance() {
		if(instance == null) {
			synchronized (instance) {
				if(instance == null) {
					instance = new SingletonSynchronized();
					}
			}
		}
		return instance;
	}
	
	public void printMessage() {
		System.out.println("I'm a synchronized singleton :)");
	}

}
