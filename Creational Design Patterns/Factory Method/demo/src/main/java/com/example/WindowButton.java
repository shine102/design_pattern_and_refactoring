package com.example;

public class WindowButton implements Button{

    @Override
    public void render() {
        System.out.println("WindowButton rendered");
    }

    @Override
    public void onClick() {
        System.out.println("WindowButton clicked");
    }
    
}
