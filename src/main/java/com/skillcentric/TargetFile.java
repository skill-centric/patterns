package com.skillcentric;

import java.io.File;

public class TargetFile {

    private final String path;
    private final Compressor compressor;

    public TargetFile(String path, Compressor compressor) {

        this.path = path;
        this.compressor = compressor;
    }

    public File compress() {

        return compressor.compressFile(path);
    }
}
