package com.sk.creating_and_destroying_objects.builderpattern;

/**
 * 
 * @author Shivam Kashyap
 *
 *
 *Here in this example using factory methods to initalize class would be a cumbersome task
 *and so with using constructor chaining as client while creating an object will likely mess up values
 */
public class NonBuilderConstructorChainingNutritionFacts {

	private final int servings; // required field
	private final int servingSize; //required field
	private final int calories;
	private final int fat;
	private final int carbohydrates;
	private final int protein;
	private final int sodium;
	private final int potassium;
	private final int calcium;
	public NonBuilderConstructorChainingNutritionFacts(int servings, int servingSize) {
		this(servings, servingSize, 0, 0, 0, 0);
	}
	public NonBuilderConstructorChainingNutritionFacts(int servings, int servingSize, int calories, int fat, int carbohydrates,
			int protein) {
		this(servings, servingSize, calories, fat, carbohydrates, protein,0,0,0);
		
	}
	public NonBuilderConstructorChainingNutritionFacts(int servings, int servingSize, int calories, int fat, int carbohydrates,
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

	
	

}
