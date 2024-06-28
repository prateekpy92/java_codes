package com.techlabs.model;

import java.util.function.BiConsumer;

@FunctionalInterface
public interface Swapping{
 BiConsumer<Integer, Integer> getSwapper();
}
