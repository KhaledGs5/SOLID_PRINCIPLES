package com.directi.training.ocp.exercise_refactored;

import java.util.HashMap;
import java.util.Map;


public class ResourceAllocator {
    private Map<ResourceType, Resource> resources = new HashMap<>();

    public ResourceAllocator() {
        resources.put(ResourceType.TIME_SLOT, new TimeSlotResource());
        resources.put(ResourceType.SPACE_SLOT, new SpaceSlotResource());
    }

    public int allocate(ResourceType resourceType) {
        Resource resource = resources.get(resourceType);
        if (resource != null) {
            return resource.allocate();
        } else {
            System.out.println("ERROR: Attempted to allocate invalid resource");
            return -1;
        }
    }

    public void free(ResourceType resourceType, int resourceId) {
        Resource resource = resources.get(resourceType);
        if (resource != null) {
            resource.free(resourceId);
        } else {
            System.out.println("ERROR: Attempted to free invalid resource");
        }
    }
}
