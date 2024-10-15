package com.directi.training.dip.exercise_refactored;

import java.util.Base64;

public class Base64EncoderModule implements IEncoder {
    @Override
    public String encode(String data) {
        return Base64.getEncoder().encodeToString(data.getBytes());
    }
}
