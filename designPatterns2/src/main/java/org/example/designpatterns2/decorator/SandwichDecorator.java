package org.example.designpatterns2.decorator;

public abstract class SandwichDecorator extends Ingredient {
	protected Ingredient basicIngredient;
	
	public SandwichDecorator(Ingredient ingredient) {
		basicIngredient = ingredient;
	}
	
	public abstract String getName();
	public abstract double getPrice();
	public abstract String toString();

}
