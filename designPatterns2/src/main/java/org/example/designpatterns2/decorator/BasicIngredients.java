package org.example.designpatterns2.decorator;

public class BasicIngredients extends Ingredient {
	
	public double getPrice() {
		return 5;
	}
	
	public String getName() {
		return "Basic ingridients: tomatoes, salad, butter, white bread ";
	}
	
	public String toString() {
		return getName() + " for price of " + getPrice(); 
	}

}
