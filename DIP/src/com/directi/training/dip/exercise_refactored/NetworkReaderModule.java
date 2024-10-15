package com.directi.training.dip.exercise_refactored;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class NetworkReaderModule implements IReader {
    private String url;

    public NetworkReaderModule(String url) {
        this.url = url;
    }

    @Override
    public String read() throws IOException {
        InputStream inputStream = new URL(url).openStream();
        InputStreamReader reader = new InputStreamReader(inputStream);
        StringBuilder data = new StringBuilder();
        int c;
        while ((c = reader.read()) != -1) {
            data.append((char) c);
        }
        return data.toString();
    }
}
