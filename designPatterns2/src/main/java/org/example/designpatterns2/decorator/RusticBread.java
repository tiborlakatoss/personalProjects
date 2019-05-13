package org.example.designpatterns2.decorator;

public class RusticBread extends SandwichDecorator {

	public RusticBread(Ingredient ingredient) {
		super(ingredient);
	}
	
	@Override
	public String getName() {
		return basicIngredient.getName() + " changed to Rustic Bread";
	}

	@Override
	public double getPrice() {
		return basicIngredient.getPrice() + 5;
	}
	
	public String toString() {
		return getName() + " for price: " + getPrice();
	}

}
