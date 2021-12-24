package com.sk.creating_and_destroying_objects.builderpattern;

/**
 * 
 * @author Shivam Kashyap
 *
 *         Here Inner static class builder wont have optional parameters as
 *         final and would have 0 as default value
 *         
 *         
 *         Steps to create a Builder pattern
 *         1. identify the fields and make them private,also create a private constructor with all the fields
 *         2. create inner static class Builder with same fields except optional fields should be non final and initialized by default values
 *         3. create setter methods   for each of fields in Builder class which return 'this' 
 *         4. lastly create a public method 'build' which returns NutritionFact object by calling its constructor with values.
 */
public class NutritionFacts {

	private final int servings; // required field
	private final int servingSize; // required field
	private final int calories;
	private final int fat;
	private final int carbohydrates;
	private final int protein;
	private final int sodium;
	private final int potassium;
	private final int calcium;

	public static class Builder {
		private final int servings; // required field
		private final int servingSize; // required field
		// optional parameters
		private int calories = 0;
		private int fat = 0;
		private int carbohydrates = 0;
		private int protein = 0;
		private int sodium = 0;
		private int potassium = 0;
		private int calcium = 0;

		public Builder(int servings, int servingSize) {
			this.servings = servings;
			this.servingSize = servingSize;
		}

		public Builder calories(int val) {
			if (val < 0) {
				throw new IllegalArgumentException();
			} else {
				calories = val;
			}
			return this;
		}

		public Builder fat(int val) {
			if (val < 0) {
				throw new IllegalArgumentException();
			} else {
				fat = val;
			}
			return this;
		}

		public Builder carbohydrates(int val) {
			if (val < 0) {
				throw new IllegalArgumentException();
			} else {
				carbohydrates = val;
			}
			return this;
		}

		public Builder protein(int val) {
			if (val < 0) {
				throw new IllegalArgumentException();
			} else {
				protein = val;
			}
			return this;
		}

		public Builder sodium(int val) {
			if (val < 0) {
				throw new IllegalArgumentException();
			} else {
				sodium = val;
			}
			return this;
		}

		public Builder potassium(int val) {
			if (val < 0) {
				throw new IllegalArgumentException();
			} else {
				potassium = val;
			}
			return this;
		}

		public Builder calcium(int val) {
			if (val < 0) {
				throw new IllegalArgumentException();
			} else {
				calcium = val;
			}
			return this;
		}

		public NutritionFacts build() {
			return new NutritionFacts(this);
		}

	}

	private NutritionFacts(Builder builder) {
		super();
		servings = builder.servings;
		servingSize = builder.servingSize;
		calcium = builder.calcium;
		calories = builder.calories;
		fat = builder.fat;
		carbohydrates = builder.carbohydrates;
		protein = builder.protein;
		sodium = builder.sodium;
		potassium = builder.potassium;

	}

	@Override
	public String toString() {
		return "NutritionFacts [servings=" + servings + ", servingSize=" + servingSize + ", calories=" + calories
				+ ", fat=" + fat + ", carbohydrates=" + carbohydrates + ", protein=" + protein + ", sodium=" + sodium
				+ ", potassium=" + potassium + ", calcium=" + calcium + "]";
	}

}
