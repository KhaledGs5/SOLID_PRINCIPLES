package com.directi.training.ocp.exercise_refactored;

public class TimeSlotResource implements Resource {
    @Override
    public int allocate() {
        int resourceId = findFreeTimeSlot();
        markTimeSlotBusy(resourceId);
        return resourceId;
    }

    @Override
    public void free(int resourceId) {
        markTimeSlotFree(resourceId);
    }

    private int findFreeTimeSlot() {
        // logic to find free time slot
        return 0;
    }

    private void markTimeSlotBusy(int resourceId) {
        // logic to mark time slot busy
    }

    private void markTimeSlotFree(int resourceId) {
        // logic to free time slot
    }
}
