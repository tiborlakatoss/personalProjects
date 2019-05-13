package org.example.designpatterns2.strategy;

public class AdditionStrategy implements Strategy {

	@Override
	public int doOperation(int num1, int num2) {
		return num1 + num2;
	}

}
