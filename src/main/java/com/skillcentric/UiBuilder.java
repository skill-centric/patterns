package com.skillcentric;

// Client
public class UiBuilder {

    public void buildButton(AbstractUiFactory uiFactory) {

        Button button = uiFactory.createButton();
        button.setTitle("New Button");

        TextView textView = uiFactory.createTextView();
        textView.setFont("Arial");
    }
}