package com.wileyedge.windowmaster;


import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class WindowMaster {
    static Scanner myScanner;

    public static void main(String[] args) throws WidthException, HeightException {
        System.out.println(WindowInterface.s);

        BigDecimal bd1 = new BigDecimal(2.2).setScale(2, RoundingMode.HALF_EVEN);
        BigDecimal bd2 = new BigDecimal("2.2");
        BigDecimal bd3 = new BigDecimal(2.2f).setScale(2, RoundingMode.HALF_EVEN);

        bd1 = bd1.add(bd2);

        // PEMDAS - Order of operations
        int i = 2 + 3 * 4;

        BigDecimal bd4 = bd1.add(bd2).multiply(bd3);



//        List<WindowInterface> windows = new ArrayList<>();
//
//        // Declare, initialize, and instantiate Window object
//        windows.add(new RectangularWindow(3, 2.3f));
//        windows.add(new RectangularWindow(20, 10));
//        windows.add(new SquareWindow(4));
//        windows.add(new RectangularWindow());
//        windows.add(new RectangularWindow());
//
//        RectangularWindow rWindow = new RectangularWindow();
//
//        rWindow.setHeight(2).setWidth(3);
//
//        System.out.println(RectangularWindow.getAreaCost());
//
//
//        try {
//            rWindow.setHeight(-10);
//            rWindow.setWidth(20);
//        } catch (HeightException | WidthException e) {
//
//            System.out.println(e.getMessage());
//        }
//            /*
//        } catch (FileNotFoundException e) {
//            System.out.println("That file does not exist. Exiting");
//            return;
//        }
//
//             */
//
//        //WindowInterface windowInterface = new WindowInterface();
//
//        Door door = new WoodDoor();
//
//
//        for (WindowInterface window: windows) {
//            System.out.println("Type: " + window.getClass().getName());
//            System.out.println("height: " + window.getHeight());
//            System.out.println("width: " + window.getWidth());
//            window.displayDetails();
//            System.out.println("cost: " + window.generateCost());
//            System.out.println();
//        }
//
//        System.out.println("Count: " + RectangularWindow.getWindowCount());


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
