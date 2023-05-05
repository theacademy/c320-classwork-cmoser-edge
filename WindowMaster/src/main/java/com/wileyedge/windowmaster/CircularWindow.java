package com.wileyedge.windowmaster;

public class CircularWindow implements WindowInterface {
    private static final float AREA_COST = 5f;
    private static final float PERIMETER_COST = 7f;

    float radius;

    public CircularWindow(int radius) {
        this.radius = radius;
    }

    @Override
    public float getHeight() {
        return 2 * this.radius;
    }

    @Override
    public float getWidth() {
        return 2 * this.radius;
    }

    @Override
    public float generateCost() {
        float area = (float) (Math.PI * Math.pow(this.radius,2));
        float perimeter = (float) (Math.PI * this.radius * 2);
        return area * AREA_COST + perimeter * PERIMETER_COST;
    }

    @Override
    public void displayDetails() {

    }
}
