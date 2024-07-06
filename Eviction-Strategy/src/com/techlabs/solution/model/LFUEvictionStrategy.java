package com.techlabs.solution.model;

import java.util.List;
import java.util.Map;
import java.util.Queue;
public class LFUEvictionStrategy<K, V> implements EvictionStrategy<K, V> {
    @Override
    public void evict(Map<K, V> memoryMap, Map<K, Integer> accessCount, Queue<K> insertionOrder, List<K> accessOrder) {
        K lfuKey = null;
        int minAccessCount = Integer.MAX_VALUE;

        for (K key : memoryMap.keySet()) {
            int count = accessCount.get(key);
            if (count < minAccessCount) {
                minAccessCount = count;
                lfuKey = key;
            } else if (count == minAccessCount && insertionOrder.contains(lfuKey) && insertionOrder.peek().equals(key)) {
                lfuKey = key;
            }
        }

        memoryMap.remove(lfuKey);
        accessCount.remove(lfuKey);
        insertionOrder.remove(lfuKey);
        accessOrder.remove(lfuKey);
    }
}

