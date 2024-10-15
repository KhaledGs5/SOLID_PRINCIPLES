package com.directi.training.ocp.exercise_refactored;

public class SpaceSlotResource implements Resource {
    @Override
    public int allocate() {
        int resourceId = findFreeSpaceSlot();
        markSpaceSlotBusy(resourceId);
        return resourceId;
    }

    @Override
    public void free(int resourceId) {
        markSpaceSlotFree(resourceId);
    }

    private int findFreeSpaceSlot() {
        // logic to find free space slot
        return 0;
    }

    private void markSpaceSlotBusy(int resourceId) {
        // logic to mark space slot busy
    }

    private void markSpaceSlotFree(int resourceId) {
        // logic to free space slot
    }
}
