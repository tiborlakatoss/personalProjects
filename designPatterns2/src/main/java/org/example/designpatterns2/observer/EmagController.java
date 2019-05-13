package org.example.designpatterns2.observer;

public class EmagController {

	public static void main(String[] args) {
		Product laptop = new Product("Macbook pro", 3400, false);
		Product tablet = new Product("ipad mini", 2000, false);

		tablet.setAvailable(false);
		laptop.setAvailable(false);

		Observer ramona = new Person("Ramona");
		Observer razvan = new Person("Razvan");
		Observer cristain = new Person("Cristian");

		laptop.addObserver(ramona);
		laptop.addObserver(razvan);
		laptop.addObserver(cristain);
		tablet.addObserver(cristain);

		laptop.setAvailable(true);
		tablet.setAvailable(true);

	}

}
