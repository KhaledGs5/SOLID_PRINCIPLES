package com.directi.training.dip.exercise_refactored;

import java.io.IOException;

public class EncodingModule {
    private IReader reader;
    private IWriter writer;
    private IEncoder encoder;

    public EncodingModule(IReader reader, IWriter writer, IEncoder encoder) {
        this.reader = reader;
        this.writer = writer;
        this.encoder = encoder;
    }

    public void encode() throws IOException {
        String data = reader.read();
        String encodedData = encoder.encode(data);
        writer.write(encodedData);
    }
}
