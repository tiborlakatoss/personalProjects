package org.example.designpatterns2.singleton;

public class SingletonEager {
	public static final SingletonEager INSTANCE = new SingletonEager();

	private SingletonEager() {
		// private constructor for singleton
	}

	public String printMessage() {
		return "I'm a singleton eager:)";
	}

	public static SingletonEager getInstance() {
		return INSTANCE;
	}
}
