package com.wileyedge.windowmaster;

public class RectangularWindow implements WindowInterface {
    // access modifier
      // variable, field, attribute, property
    private float height;
    private float width;

    private static int windowCount = 0;

    public void displayDetails(){

    }
    
    // constructor
    // Method overloading
    public RectangularWindow(float height, float width){
        windowCount++;
        this.height = height;
        this.width = width;
    }

    // Default constructor
    public RectangularWindow() {
        windowCount++;
    }

    public float generateCost() {
        float area = height * width;
        float perimeter = 2 * (height + width);

        float cost = (3.5f * area) + (2.25f * perimeter);

        return cost;
    }

    public static void showHelloWorld(){
        System.out.println("Count: " + windowCount);
        System.out.println("Hello World");
    }

    public void setHeight(float height) {
        if (height < 0)
            this.height = 0;
        else
            this.height = height;
    }

    public float getHeight() {
        return height;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public static int getWindowCount() {
        return windowCount;
    }
}
