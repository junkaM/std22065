package com.helloworld.demo.file.hash;

import com.helloworld.demo.PojaGenerated;

@PojaGenerated
public record FileHash(FileHashAlgorithm algorithm, String value) {}
