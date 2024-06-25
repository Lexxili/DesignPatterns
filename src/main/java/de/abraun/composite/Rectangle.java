package de.abraun.composite;

public class Rectangle extends AbstractGeoForm {
    private int height, width;

    public Rectangle(int x, int y, int height, int width) {
        super(x, y);
        this.height = height;
        this.width = width;
    }

    @Override
    public void print() {
        System.out.println("Rectangle: x=" + super.getX() + ", y=" + super.getY() + ", width=" + width + ", height=" + height);
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
