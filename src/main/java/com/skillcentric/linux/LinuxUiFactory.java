package com.skillcentric.linux;

import com.skillcentric.AbstractUiFactory;
import com.skillcentric.Button;
import com.skillcentric.TextView;

// ConcreteFactory 2
public class LinuxUiFactory implements AbstractUiFactory {

    @Override
    public Button createButton() {

        return new LinuxButton();
    }

    @Override
    public TextView createTextView() {

        return new LinuxTextView();
    }
}