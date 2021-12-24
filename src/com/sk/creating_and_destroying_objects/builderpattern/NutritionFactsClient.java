package com.sk.creating_and_destroying_objects.builderpattern;

public class NutritionFactsClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NutritionFacts banana = new NutritionFacts.Builder(10, 1).calories(100).calcium(0).carbohydrates(200).fat(10)
				.protein(750).build();
		System.out.println(banana);

	}

}
