package edu.dlou.computer.tria;

public class Tria {
    private double length1;
    private double length2;
    private double length3;
    public Tria(double length1, double length2, double length3) {
        this.length1 = length1;
        this.length2 = length2;
        this.length3 = length3;
    }
    public void setLength1(double length1) {
        this.length1 = length1;
    }
    public void setLength2(double length2) {
        this.length2 = length2;
    }
    public void setLength3(double length3) {
        this.length3 = length3;
    }
    public boolean isValid() {
        return (length1 + length2 > length3) &&
                (length1 + length3 > length2) &&
                (length2 + length3 > length1);
    }
    public double getArea() {
        if (isValid()) {
            double s = (length1 + length2 + length3) / 2;
            return Math.sqrt(s * (s - length1) * (s - length2) * (s - length3));
        } else {
            return -1;
        }
    }
    public double getPerimeter() {
        if (isValid()) {
            return length1 + length2 + length3;
        } else {
            return -1;
        }
    }
}