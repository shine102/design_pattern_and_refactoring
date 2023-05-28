package com.example;

public abstract class Dialog {
    void render() {
        Button okButton = createButton();
        okButton.onClick();
        okButton.render();
    };

    abstract Button createButton();
}
