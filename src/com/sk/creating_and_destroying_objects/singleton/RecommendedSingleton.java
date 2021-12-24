package com.sk.creating_and_destroying_objects.singleton;

public enum RecommendedSingleton {
    
    INSTANCE;

    /**
     * other methods to follow
     */
        // This code would normally appear outside the class!
      

    private void runSomething() {
    }public static void main(String[] args) {
        RecommendedSingleton obj = RecommendedSingleton.INSTANCE;
        obj.runSomething();
    }
}
