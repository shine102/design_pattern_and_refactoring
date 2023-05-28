package com.example;

public class WebDialog extends Dialog{

    @Override
    Button createButton() {
        return new HtmlButton();
    }
    
}
