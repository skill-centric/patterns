package com.skillcentric;

import java.io.File;

public abstract class Compressor {

    public File compressFile(String path) {

        CompressionAlgo compressionAlgo = getCompressionAlgo();

        return compressionAlgo.compress(path);
    }

    // Factory method
    public abstract CompressionAlgo getCompressionAlgo();
}