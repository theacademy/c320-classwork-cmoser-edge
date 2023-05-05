package com.wileyedge.windowmaster;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RectangularWindowTest {

    @Test
    void testAreaCost() {
        assertEquals(4.5f, RectangularWindow.getAreaCost());
    }

    @Test
    void testObject() {
        RectangularWindow window1 = new RectangularWindow(1,2);
        RectangularWindow window2 = new RectangularWindow(1,2);

        assertTrue(window1.equals(window2));
        assertEquals(window1, window2);

        //assertEquals(window1.getHeight(), window2.getHeight());
        //assertEquals(window1.getWidth(), window2.getWidth());
    }

    @Test
    void testSetHeightException() {
        RectangularWindow window = new RectangularWindow(1,2);

        Exception exception = assertThrows(HeightException.class, () -> {
            window.setHeight(-1);
        }, "HeightException was not thrown.");

//        try {
//            window.setHeight(-1);
//            fail("setHeight(-1) did not throw an exception");
//        } catch (HeightException e) {
//            assertTrue(true, "HeightException was caught");
//        } catch (Exception e) {
//            fail("setHeight(-1) threw incorrect type of exception");
//        }

    }
}
