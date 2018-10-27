package com.skillcentric;

public class LoggerAdapter implements Logger {

    private LibraryLogger libraryLogger = new LibraryLogger();

    @Override
    public void info() {
        libraryLogger.debug();
    }

    @Override
    public void severe() {
        libraryLogger.error();
    }
}
