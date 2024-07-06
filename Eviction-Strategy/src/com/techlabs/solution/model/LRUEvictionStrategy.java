package com.techlabs.solution.model;

import java.util.List;
import java.util.Map;
import java.util.Queue;

public class LRUEvictionStrategy<K, V> implements EvictionStrategy<K, V> {
    @Override
    public void evict(Map<K, V> memoryMap, Map<K, Integer> accessCount, Queue<K> insertionOrder, List<K> accessOrder) {
        K lruKey = accessOrder.get(0);
        memoryMap.remove(lruKey);
        accessCount.remove(lruKey);
        insertionOrder.remove(lruKey);
        accessOrder.remove(lruKey);
    }
}
