package org.example.designpatterns2.singleton;

public class SingletonMain {

	public static void main(String[] args) {
		// Singleton instantiated eagerly = when application starts
		SingletonEager singletonEager = SingletonEager.INSTANCE;
		System.out.println(singletonEager.printMessage());
		SingletonEager singletonEager2 = singletonEager.getInstance();
		System.out.println(singletonEager2.printMessage());
		SingletonEager.INSTANCE.printMessage();

		System.out.println(singletonEager == singletonEager2);

		// Singleton instantiated lazy = first use in the application
		SingletonLazy singletonLazy = SingletonLazy.getInstance();
		singletonLazy.printMessage();

		SingletonLazy singletonLazy2 = SingletonLazy.getInstance();

		System.out.println(singletonLazy == singletonLazy2);

		SingletonBillPugh singletonBillPugh = SingletonBillPugh.getInstance();
		singletonBillPugh.printMessage();

		SingletonBillPugh singletonBillPugh2 = SingletonBillPugh.getInstance();

		System.out.println(singletonBillPugh == singletonBillPugh2);
	}

}
