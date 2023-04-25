package com.wileyedge.windowmaster;


import java.util.Scanner;

public class WindowMaster {
    public static void main (String[] args) {
        float height;
        float width;

        String stringHeight;
        String stringWidth;

        Scanner myScanner = new Scanner(System.in);

        // Ask user for information
        System.out.println("Please enter window height:");
        stringHeight = myScanner.nextLine();
        System.out.println("Please enter window width:");
        stringWidth = myScanner.nextLine();

        height = Float.parseFloat(stringHeight);
        width = Float.parseFloat(stringWidth);
        
        // calculate area and perimeter
        float area = height * width;
        float perimeter = 2 * (height + width);

        // calculate the cost
        float cost = (3.5f * area) + (2.25f * perimeter);

        // display results
        System.out.println("Window height = " + stringHeight);
        System.out.println("Window width = " + stringWidth);
        System.out.println("Window area = " + area);
        System.out.println("Window perimeter = " + perimeter);
        System.out.println("Window cost = " + cost);
    }
}
