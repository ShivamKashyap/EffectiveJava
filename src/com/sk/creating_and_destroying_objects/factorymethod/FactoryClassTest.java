package com.sk.creating_and_destroying_objects.factorymethod;

public class FactoryClassTest {
	
	/**
	 * 
	 * @param shivam
	 */
	public static void main(String... shivam) {
		
		FactoryClass factoryObj = FactoryClass.getFactoryXYInstance("X");
		System.out.println(factoryObj);
		
		FactoryClass factoryObj1 = FactoryClass.getFactoryXYInstance("X");
		System.out.println(factoryObj);
		
		if(factoryObj == factoryObj1) {
			System.out.println("FactoryClass object has only 1 object with field X");
		}
		
	}

}
