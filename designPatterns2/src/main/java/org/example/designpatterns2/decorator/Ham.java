package org.example.designpatterns2.decorator;

public class Ham extends SandwichDecorator {

	public Ham(Ingredient ingredient) {
		super(ingredient);
	}

	@Override
	public String getName() {
		return basicIngredient.getName() + " added ham";
	}

	@Override
	public double getPrice() {
		return basicIngredient.getPrice() + 1;
	}

	@Override
	public String toString() {
		return getName() + " for price" + getPrice();
	}

}
