package com.directi.training.isp.exercise_refactored;

import java.util.Random;

public class Sensor {
    public void register(ProximitySensorDoor door) {
        while (true) {
            if (isPersonClose()) {
                door.proximityCallback();
                break;
            }
        }
    }

    private boolean isPersonClose() {
        return new Random().nextBoolean();
    }
}
