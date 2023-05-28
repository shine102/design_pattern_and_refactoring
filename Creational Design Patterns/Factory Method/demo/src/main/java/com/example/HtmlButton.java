package com.example;

public class HtmlButton implements Button{

    @Override
    public void render() {
        System.out.println("HtmlButton rendered");
    }

    @Override
    public void onClick() {
        System.out.println("HtmlButton clicked");
    }
    
}
