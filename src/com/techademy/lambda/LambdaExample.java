package com.techademy.lambda;

interface Greeting {
    void sayMessage(String message);
}

public class LambdaExample {
    public static void main(String[] args) {
        Greeting greeting = (message) -> System.out.println("Hello, " + message);
        greeting.sayMessage("Alice");
    }
}
