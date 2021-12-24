package com.sk.creating_and_destroying_objects.singleton;

/**
 * Early initialization
 */
public class SingletonExample1 {
    
    public static SingletonExample1 INSTANCE = new SingletonExample1();

    private SingletonExample1() {
    }
        
}
