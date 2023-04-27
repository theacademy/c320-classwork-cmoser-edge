package com.wileyedge.windowmaster;

public class SquareWindow extends RectangularWindow {

    public SquareWindow(float height) {
        super(height, height);
    }

    public void setHeight(float height) {
        this.setWidth(height);
        this.setHeight(height);
    }

    public void setWidth(float width) {
        this.setWidth(width);
        this.setHeight(width);
    }

}
