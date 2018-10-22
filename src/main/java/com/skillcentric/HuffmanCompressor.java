package com.skillcentric;

public class HuffmanCompressor extends Compressor {

    @Override
    public CompressionAlgo getCompressionAlgo() {

        return new HuffmanCompressionAlgo();
    }
}