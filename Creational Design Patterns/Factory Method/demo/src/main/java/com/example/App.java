package com.example;

/**
 * Hello world!
 */
public class App {
    private Dialog dialog;

    private App(){
        if (System.getProperty("os.name").equals("Windows 10")) {
            this.dialog = new WindowDialog();
        } else {
            this.dialog = new WebDialog();
        }
    }
    public static void main(String[] args) {
        App app = new App();
        app.dialog.render();
    }
}
