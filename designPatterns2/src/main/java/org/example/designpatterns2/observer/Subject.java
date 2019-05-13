package org.example.designpatterns2.observer;

public interface Subject {
	
	public void addObserver(Observer observer);

	public void removeObserver(Observer observer);

	public void notifyObservers();

}
