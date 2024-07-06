package com.techlabs.solution.model;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class FIFOEvictionStrategy<K, V> implements EvictionStrategy<K, V> {
    @Override
    public void evict(Map<K, V> memoryMap, Map<K, Integer> accessCount, Queue<K> insertionOrder, List<K> accessOrder) {
        K fifoKey = insertionOrder.poll();
        memoryMap.remove(fifoKey);
        accessCount.remove(fifoKey);
        accessOrder.remove(fifoKey);
    }
}

