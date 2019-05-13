package org.example.designpatterns2.decorator;

public class OlivesBread extends SandwichDecorator {

	public OlivesBread(Ingredient ingredient) {
		super(ingredient);
	}

	@Override
	public String getName() {
		return basicIngredient.getName() + " changed to olives Bread";
	}

	@Override
	public double getPrice() {
		return basicIngredient.getPrice() + 3;
	}
	
	public String toString() {
		return getName() + " for price: " + getPrice();
	}
	
}
