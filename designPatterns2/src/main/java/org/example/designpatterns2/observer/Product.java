package org.example.designpatterns2.observer;

import java.util.ArrayList;
import java.util.List;

public class Product implements Subject {
	private List<Observer> observers = new ArrayList<>();
	
	private String name;
	private double price;
	private boolean available;
	
	public Product(String name, double price, boolean available) {
		this.name = name;
		this.price = price;
		this.available = available;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public boolean isAvailable() {
		return available;
	}
	public void setAvailable(boolean available) {
		this.available = available;
		if(this.available == true) {
			notifyObservers();
		}
	}

	public void addObserver(Observer observer) {
		observers.add(observer);
	}

	public void removeObserver(Observer observer) {
		observers.add(observer);
	}

	public void notifyObservers() {
		System.out.println("Notified observers");
		for(Observer observer : observers) {
			observer.update(this);
		}
	}

}
