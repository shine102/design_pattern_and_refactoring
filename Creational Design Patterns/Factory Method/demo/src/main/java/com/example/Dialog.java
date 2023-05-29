package com.example;

public abstract class Dialog {
    // Common logic for all dialogs
    // other business logic
    
    void render() {
        Button okButton = createButton();
        okButton.onClick();
        okButton.render();
    };

    abstract Button createButton();
}
