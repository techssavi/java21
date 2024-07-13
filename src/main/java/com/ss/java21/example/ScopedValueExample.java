package com.ss.java21.example;

public class ScopedValueExample {

    static ScopedValue<String> SCOPED_USEROBJ = ScopedValue.newInstance();

    public static void main(String[] args) {
       ScopedValue.runWhere(SCOPED_USEROBJ, args[0], () -> {
            System.out.println("User: " + SCOPED_USEROBJ.get());
            processUserData();
        });


    }

    private static void processUserData() {
        System.out.println("Processing data for: " + SCOPED_USEROBJ.get() );
    }
}
