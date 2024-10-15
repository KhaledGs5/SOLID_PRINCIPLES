package com.directi.training.dip.exercise_refactored;

import java.util.HashMap;
import java.util.Map;

public class DatabaseWriterModule implements IWriter {
    private static Map<Integer, String> data = new HashMap<>();
    private static int count = 0;

    @Override
    public void write(String inputString) {
        data.put(++count, inputString);
    }
}
