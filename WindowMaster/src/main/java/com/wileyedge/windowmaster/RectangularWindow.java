package com.wileyedge.windowmaster;

import java.util.Objects;

public class RectangularWindow implements WindowInterface, ItemInterface {

    // Constants
    private static final float AREA_COST = 4.5f;
    private static final float PERIMETER_COST = 2.25f;

    // access modifier
      // variable, field, attribute, property
    private float height;
    private float width;

    private static int windowCount = 0;

    public void displayDetails(){

    }

    public static float getAreaCost() {
        return AREA_COST;
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

        float cost = (AREA_COST * area) + (PERIMETER_COST * perimeter);

        return cost;
    }

    public static void showHelloWorld(){
        System.out.println("Count: " + windowCount);
        System.out.println("Hello World");
    }

    public void setHeight(float height) throws HeightException, WidthException {
        if (height <= 0)
            height = 0; //throw new HeightException("Height must be greater than 0");

        this.height = height;
    }

    public float getHeight() {
        return height;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) throws WidthException {
        if (width <= 0)
            throw new WidthException("Width must be greater than 0");

        this.width = width;
    }

    public static int getWindowCount() {
        return windowCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RectangularWindow that = (RectangularWindow) o;
        return Float.compare(that.height, height) == 0 && Float.compare(that.width, width) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(height, width);
    }

    //    @Override
//    public int hashCode() {
//        int hash = 7;
//        hash = 89 * hash + Objects.hashCode(this.height);
//        hash = 89 * hash + Objects.hashCode(this.width);
//        return hash;
//    };
//
//    @Override
//    public boolean equals(Object object) {
//        if(this.getClass() != object.getClass())
//            return false;
//
//        if (this == object)
//            return true;
//
//        if (object == null)
//            return false;
//
//        RectangularWindow window = (RectangularWindow) object;
//        if (this.height == window.getHeight()
//            && this.width == window.getWidth())
//            return true;
//
//        return false;
//    }
}
