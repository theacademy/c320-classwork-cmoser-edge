package com.wileyedge.windowmaster;

public class SquareWindow extends RectangularWindow {

    public SquareWindow(float height) {
        super(height, height);
    }

    @Override
    public RectangularWindow setHeight(float height) {
        this.setWidth(height);
        this.setHeight(height);
    ;    return this;
    }

    @Override
    public RectangularWindow setWidth(float width) {
        this.setWidth(width);
        this.setHeight(width);
        return this;
    }

}
