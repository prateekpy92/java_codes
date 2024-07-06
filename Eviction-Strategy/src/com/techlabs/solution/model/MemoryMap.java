package com.techlabs.solution.model;

import java.util.*;

public class MemoryMap<K, V> {
    private final int capacity;
    private final Map<K, V> memoryMap;
    private final Map<K, Integer> accessCount;
    private final Queue<K> insertionOrder;
    private final List<K> accessOrder;
    private final EvictionStrategy<K, V> evictionStrategy;

    public MemoryMap(int capacity, EvictionStrategy<K, V> evictionStrategy) {
        this.capacity = capacity;
        this.evictionStrategy = evictionStrategy;
        this.memoryMap = new HashMap<>();
        this.accessCount = new HashMap<>();
        this.insertionOrder = new LinkedList<>();
        this.accessOrder = new ArrayList<>();
    }

    public V get(K key) {
        if (!memoryMap.containsKey(key)) {
            return null;
        }
        accessCount.put(key, accessCount.getOrDefault(key, 0) + 1);
        accessOrder.remove(key);
        accessOrder.add(key);
        return memoryMap.get(key);
    }

    public void put(K key, V value) {
        if (memoryMap.size() >= capacity) {
            evictionStrategy.evict(memoryMap, accessCount, insertionOrder, accessOrder);
        }
        memoryMap.put(key, value);
        accessCount.put(key, 0);
        insertionOrder.add(key);
        accessOrder.add(key);
    }

    @Override
    public String toString() {
        return "MemoryMap{" +
                "memoryMap=" + memoryMap +
                ", accessCount=" + accessCount +
                '}';
    }
}
