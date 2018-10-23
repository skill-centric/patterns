package com.skillcentric;

import com.skillcentric.linux.LinuxUiFactory;
import com.skillcentric.windows.WindowsUiFactory;

import java.util.logging.Logger;

public class App {

    private static Logger log = Logger.getLogger(App.class.getName());

    public static void main(String[] args) {

        UiBuilder builder = new UiBuilder();
        AbstractUiFactory uiFactory = null;

        Platform platform = Platform.LINUX;

        switch (platform) {

            case LINUX:
                uiFactory = new LinuxUiFactory();
                break;
            case WINDOWS:
                uiFactory = new WindowsUiFactory();
                break;
            default:
        }

        builder.buildButton(uiFactory);
    }
}

