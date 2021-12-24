package com.sk.creating_and_destroying_objects.builderpattern;

public class NonBuilderJavaBeanNutritionFacts {

	private final int servings; // required field
	private final int servingSize; //required field
	private final int calories;
	private final int fat;
	private final int carbohydrates;
	private final int protein;
	private final int sodium;
	private final int potassium;
	private final int calcium;
	
	public NonBuilderJavaBeanNutritionFacts(int servings, int servingSize, int calories, int fat, int carbohydrates,
			int protein, int sodium, int potassium, int calcium) {
		super();
		this.servings = servings;
		this.servingSize = servingSize;
		this.calories = calories;
		this.fat = fat;
		this.carbohydrates = carbohydrates;
		this.protein = protein;
		this.sodium = sodium;
		this.potassium = potassium;
		this.calcium = calcium;
	}
	public int getServings() {
		return servings;
	}
	public int getServingSize() {
		return servingSize;
	}
	public int getCalories() {
		return calories;
	}
	public int getFat() {
		return fat;
	}
	public int getCarbohydrates() {
		return carbohydrates;
	}
	public int getProtein() {
		return protein;
	}
	public int getSodium() {
		return sodium;
	}
	public int getPotassium() {
		return potassium;
	}
	public int getCalcium() {
		return calcium;
	}
}
