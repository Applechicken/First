package edu.dlou.computer.rect;

public class Rect {
    private double rectLength;
    private double rectWidth;

    public Rect(double rectLength, double rectWidth) {
        this.rectLength = rectLength;
        this.rectWidth = rectWidth;
    }

    public void setRectLength(double rectLength) {
        this.rectLength = rectLength;
    }

    public void setRectWidth(double rectWidth) {
        this.rectWidth = rectWidth;
    }

    public boolean isValid() {
        return rectLength >= rectWidth;
    }

    public double getArea() {
        if (isValid()) {
            return rectLength * rectWidth;
        } else {
            return -1;
        }
    }

    public double getPerimeter() {
        if (isValid()) {
            return 2 * (rectLength + rectWidth);
        } else {
            return -1;
        }
    }
    public double getAreaPublic() {
        if (isValid()) {
            return rectLength * rectWidth;
        } else {
            return -1;
        }
    }

    double getAreaDefault() {
        if (isValid()) {
            return rectLength * rectWidth;
        } else {
            return -1;
        }
    }

    private double getAreaPrivate() {
        if (isValid()) {
            return rectLength * rectWidth;
        } else {
            return -1;
        }
    }
}
