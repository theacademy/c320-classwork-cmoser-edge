package com.wileyedge.windowmaster;


import java.util.Scanner;

// Pascal / Upper Camel Case
public class WindowMaster {

    // Comments
    // Identifiers (variable, method, class, package, etc)
    // Data Types
    // Literals
    // Variables
    // Expressions (Things that can be evaluated)
    //
    /*
    Multiline comments
     */
    static float height;
    static float width = 2;


    public static void main (String[] args) {
        // Declare a variable

        // Problem when i = 900
        for (int i = 0; i < 1000; i++) {
            System.out.println("i: " + i);
        }

        // Initialized
        height = 3;
        System.out.println(height);

        String thisVariableIsAWholeSentence;
        String stringHeight;
        String stringWidth;

        // Declared and initialized, instantiated
        Scanner myScanner = new Scanner(System.in);

        // Ask user for information
        // TODO: Ask user for name
        System.out.println("Please enter window height:");
        stringHeight = myScanner.nextLine();
        System.out.println("Please enter window width:");
        stringWidth = myScanner.nextLine();

        // TODO: Make sure float was entered before parsing
        height = Float.parseFloat(stringHeight);
        width = Float.parseFloat(stringWidth);

        String test = null;

        {
            String testVariable = "Yes";
            System.out.println(testVariable);
        }

        if (height <= 0 || width <= 0) {
            String testVariable = "Yes";
            System.out.println(testVariable);
            System.out.println("Make sure height and width > 0");
            return;
        }

        // calculate area and perimeter
        float area = height * width;
        float perimeter = 2 * (height + width);

        // calculate the cost
        float cost = (3.5f * area) + (2.25f * perimeter); // Comment

        boolean b = area > perimeter;

        // display results
        //System.out.println("Window height = " + stringHeight);
        System.out.println("Window width = " + stringWidth);
        System.out.println("Window area = " + area);
        System.out.println("Window perimeter = " + perimeter);
        System.out.println("Window cost = " + cost);
    }
}
