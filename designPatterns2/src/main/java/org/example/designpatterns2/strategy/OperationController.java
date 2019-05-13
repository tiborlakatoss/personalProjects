package org.example.designpatterns2.strategy;

import java.util.ArrayList;
import java.util.Collections;

public class OperationController {

	public static void main(String[] args) {
		int additionResult = OperationContext.executeStrategy(10, 5, new AdditionStrategy());
		
		System.out.println("10+5=" + additionResult);
		
		System.out.println("10-5=" + OperationContext.executeStrategy(10, 5, new SubstractionStrategy()));
		
		System.out.println("10*5=" + OperationContext.executeStrategy(10, 5, new MultiplicationStrategy()));
		
		Collections.sort(new ArrayList());
//		Collections.sort(list, TaskComparatorDesc());
	}

}
