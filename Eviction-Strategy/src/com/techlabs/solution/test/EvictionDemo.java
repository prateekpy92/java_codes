package com.techlabs.solution.test;

import com.techlabs.solution.model.FIFOEvictionStrategy;
import com.techlabs.solution.model.LFUEvictionStrategy;
import com.techlabs.solution.model.LRUEvictionStrategy;
import com.techlabs.solution.model.MemoryMap;

public class EvictionDemo {
    public static void main(String[] args) {
        MemoryMap<String, Integer> fifoMemoryMap = new MemoryMap<>(3, new FIFOEvictionStrategy<>());
        MemoryMap<String, Integer> lruMemoryMap = new MemoryMap<>(3, new LRUEvictionStrategy<>());
        MemoryMap<String, Integer> lfuMemoryMap = new MemoryMap<>(3, new LFUEvictionStrategy<>());

        
        fifoMemoryMap.put("a", 0);
        fifoMemoryMap.put("b", 0);
        fifoMemoryMap.put("c", 0);

        lruMemoryMap.put("a", 0);
        lruMemoryMap.put("b", 0);
        lruMemoryMap.put("c", 0);

        lfuMemoryMap.put("a", 0);
        lfuMemoryMap.put("b", 0);
        lfuMemoryMap.put("c", 0);

        
        fifoMemoryMap.get("b");
        fifoMemoryMap.get("b");
        fifoMemoryMap.get("a");
        fifoMemoryMap.get("a");
        fifoMemoryMap.get("c");
        fifoMemoryMap.get("a");

        lruMemoryMap.get("b");
        lruMemoryMap.get("b");
        lruMemoryMap.get("a");
        lruMemoryMap.get("a");
        lruMemoryMap.get("c");
        lruMemoryMap.get("a");

        lfuMemoryMap.get("b");
        lfuMemoryMap.get("b");
        lfuMemoryMap.get("a");
        lfuMemoryMap.get("a");
        lfuMemoryMap.get("c");
        lfuMemoryMap.get("a");

       
        fifoMemoryMap.put("d", 0);
        lruMemoryMap.put("d", 0);
        lfuMemoryMap.put("d", 0);

       
        System.out.println("FIFO Memory Map: " + fifoMemoryMap);
        System.out.println(" " );
        System.out.println("LRU Memory Map: " + lruMemoryMap);
        System.out.println(" " );
        System.out.println("LFU Memory Map: " + lfuMemoryMap);
    }
}

