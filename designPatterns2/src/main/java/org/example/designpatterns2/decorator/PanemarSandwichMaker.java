package org.example.designpatterns2.decorator;

public class PanemarSandwichMaker {
	
	public static void main(String[] ars) {
		Ingredient basicSandwich = new BasicIngredients();
		System.out.println(basicSandwich);
		
		Ingredient olivesBreadSandwich = new BasicIngredients();
		olivesBreadSandwich = new OlivesBread(olivesBreadSandwich);
		olivesBreadSandwich = new Ham(olivesBreadSandwich);
		
		System.out.println(olivesBreadSandwich);
		
		Ingredient rusticBreadSandwich = new BasicIngredients();
		rusticBreadSandwich = new RusticBread(rusticBreadSandwich);
		rusticBreadSandwich = new Ham(rusticBreadSandwich);
		
		System.out.println(rusticBreadSandwich);
	}
	
}
