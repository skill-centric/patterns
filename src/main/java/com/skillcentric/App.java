package com.skillcentric;

public class App {

    public static void main(String[] args) {

        TargetFile file = new TargetFile(
                "/foo/bar/text.txt",
                new RleCompressor()
        );

        file.compress();
    }
}