package com.techlabs.test;

import com.techlabs.model.BoxWeight;

public class BoxTest {

    public static void main(String[] args) {
        BoxWeight boxWeight = new BoxWeight(30, 50, 20, 100);

        System.out.println("Width: " + boxWeight.getWidth());
        System.out.println("Height: " + boxWeight.getHeight());
        System.out.println("Depth: " + boxWeight.getDepth());
        System.out.println("Weight: " + boxWeight.getWeight());
    }
}
//