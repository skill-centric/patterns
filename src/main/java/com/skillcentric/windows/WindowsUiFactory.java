package com.skillcentric.windows;

import com.skillcentric.AbstractUiFactory;
import com.skillcentric.Button;
import com.skillcentric.TextView;

// ConcreteFactory1
public class WindowsUiFactory implements AbstractUiFactory {

    @Override
    public Button createButton() {

        return new WindowsButton();
    }

    @Override
    public TextView createTextView() {

        return new WindowsTextView();
    }
}