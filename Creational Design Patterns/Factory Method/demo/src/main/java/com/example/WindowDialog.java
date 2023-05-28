package com.example;

public class WindowDialog extends Dialog{

    @Override
    Button createButton() {
        return new WindowButton();
    }
    
}
