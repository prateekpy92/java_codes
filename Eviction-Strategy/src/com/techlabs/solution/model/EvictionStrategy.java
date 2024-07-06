package com.techlabs.solution.model;

import java.util.List;
import java.util.Map;
import java.util.Queue;

public interface EvictionStrategy<K, V> {
    void evict(Map<K, V> memoryMap, Map<K, Integer> accessCount, Queue<K> insertionOrder, List<K> accessOrder);
}


