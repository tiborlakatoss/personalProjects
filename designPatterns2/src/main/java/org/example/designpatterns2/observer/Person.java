package org.example.designpatterns2.observer;

public class Person implements Observer {
	private String name;

	public Person(String name) {
		this.name = name;
	}

	@Override
	public void update(Product product) {
		System.out.println("Hey " + name + " your product " + product.getName() + " is now available");
	}

}
