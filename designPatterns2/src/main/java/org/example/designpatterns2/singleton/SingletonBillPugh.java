package org.example.designpatterns2.singleton;

public class SingletonBillPugh {
	
	private SingletonBillPugh() {
		//private constructor for singleton
	}

	private static class BillPughSingletonImplementation {
		private static final SingletonBillPugh INSTANCE = new SingletonBillPugh();
	}
	
	public static SingletonBillPugh getInstance() {
		return BillPughSingletonImplementation.INSTANCE;
	}

	public void printMessage() {
		System.out.println("I'm Bill Pugh singleton :)");
	}

}
