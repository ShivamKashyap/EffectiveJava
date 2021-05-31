package com.sk.creating_and_destroying_objects.factorymethod;

/**
 * 
 * @author Shivam Kashyap
 * 
 * Advantages of static factory methods:
 * 1. Unlike Constructors, static factory method have names
 * 2. Unlike Constructors, static factory methods need not  required to create a new object each time they are invoked(Restrictive Instance).
 * 3. Unlike Constructors, static factory methods can return an object of any sub type of their return type
 * 4. In Static factory methods, class of the returned object can vary from call to call as function of the input parameter.
 * 5.  In Static factory methods, class of the returned object need not exist  when the class containing the method is return.
 * 
 * LIMITATION of Static factory method:
 * 1. static factory methods is that classes without public or protected constructors cannot be sub classed.
 * 2. Static factory method  are hard to for programmers to find (programmers have to refer java doc)
 *
 */
class FactoryClass {

	private String field;

	private FactoryClass(String field) {
		this.field = field;
	}

	private static final String FIELD_X = "X";
	private static final String FIELD_Y = "Y";

	private static FactoryClass factoryXObj;
	private static FactoryClass factoryYObj;

	/**
	 * public factory method replaces public constructor and restrict the creation
	 * of multiple Factory class instances it restricts the program to create only
	 * two instances of Factory class, one with field X and one with field Y
	 * 
	 * @param field inputs String field, which ideally should be X or Y
	 * @return FactoryClass object as per input field pass, returns null if passed
	 *         any other value then 'X' or 'Y'
	 */
	public static FactoryClass getFactoryXYInstance(String field) {

		FactoryClass factoryObj = null;

		if (field.equals(FIELD_X)) {

			if (factoryXObj == null) {
				factoryXObj = new FactoryClass(FactoryClass.FIELD_X);
			}

			factoryObj = factoryXObj;
		} else if (field.equals(FIELD_Y)) {

			if (factoryYObj == null) {
				factoryYObj = new FactoryClass(FIELD_Y);
			}
			factoryObj = factoryYObj;

		}
		return factoryObj;

	}

	@Override
	public String toString() {
		return "FactoryClass [field=" + field + "]";
	}

}
