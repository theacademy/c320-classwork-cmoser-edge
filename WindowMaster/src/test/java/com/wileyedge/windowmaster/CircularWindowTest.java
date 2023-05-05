package com.wileyedge.windowmaster;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircularWindowTest {

    CircularWindow window = new CircularWindow(3);

    @Test
    void getHeight() {
        assertEquals(6, window.getHeight());
    }

    @Test
    void getWidth() {
        assertEquals(6, window.getWidth());
    }

    @Test
    void generateCost() {
        // Area cost = 5.0;
        // Perimeter cost = 7.0
        float area = (float) (Math.PI * 9);
        float perimeter = (float) (Math.PI * 6);
        assertEquals(5f * area + 7f * perimeter, window.generateCost());
    }

    @Test
    void displayDetails() {
    }
}