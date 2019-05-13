package org.example.designpatterns2.observer;

public interface Observer {
	
	/**
	 * Method called when subject changes state
	 */
	public void update(Product product);

}
