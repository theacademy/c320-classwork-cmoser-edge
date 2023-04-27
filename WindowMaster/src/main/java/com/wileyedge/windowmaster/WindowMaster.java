package com.wileyedge.windowmaster;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WindowMaster {
    static Scanner myScanner;

    public static void main (String[] args) {

        List<Window> windows = new ArrayList<>();

        // Declare, initialize, and instantiate Window object
        windows.add(new Window(3, 2.3f));
        windows.add(new Window(20, 10));
        windows.add(new Window());
        windows.add(new Window());
        windows.add(new Window());


        for (Window window: windows) {
            System.out.println("height: " + window.getHeight());
            System.out.println("width: " + window.getWidth());
            System.out.println("cost: " + window.generateCost());
        }

        System.out.println("Count: " + Window.getWindowCount());


//        float height;
//        float width;
//
//        String stringHeight;
//        String stringWidth;
//
//        myScanner = new Scanner(System.in);
//
//        // Ask user for information
//        height = retrieveHeight();
//
//
//        System.out.println("Please enter window width:");
//        stringWidth = myScanner.nextLine();
//
//        width = Float.parseFloat(stringWidth);
//
//        // calculate area and perimeter
//        float area = height * width;
//        float perimeter = 2 * (height + width);
//
//        // calculate the cost
//        float cost = (3.5f * area) + (2.25f * perimeter);
//
//        // display results
//        System.out.println("Window height = " + height);
//        System.out.println("Window width = " + stringWidth);
//        System.out.println("Window area = " + area);
//        System.out.println("Window perimeter = " + perimeter);
//        displayCost(cost);
        //System.out.println("Window cost = " + cost);
    }

    private static float retrieveHeight() {
        System.out.println("Please enter window height:");
        String stringHeight = myScanner.nextLine();
        float height = Float.parseFloat(stringHeight);
        return height;
    }

    private static void displayCost(float cost) {
        System.out.println("Window cost = " + cost);
    }
}
