package com.skillcentric;

public class RleCompressor extends Compressor {

    @Override
    public CompressionAlgo getCompressionAlgo() {

        return new RleCompressionAlgo();
    }
}