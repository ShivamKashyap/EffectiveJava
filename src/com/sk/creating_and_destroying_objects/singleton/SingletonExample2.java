package com.sk.creating_and_destroying_objects.singleton;

/**
 * here both constructor and INSTANCE ref would be private and Instance of Singleton would be accessible by static method getInstance
 */
public class SingletonExample2 {

    private static SingletonExample2 INSTANCE = new SingletonExample2();

    private SingletonExample2() {

    }

    public static SingletonExample2 getInstance() {

        return INSTANCE;
    }
}
