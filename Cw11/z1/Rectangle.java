package Cw11.z1;

import Cw11.z1.Figure;

public class Rectangle implements Figure {

    double sideA;
    double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double getPerimeter() {
        return 2*(sideA+sideB);
    }

    @Override
    public double getArea() {
        return sideA*sideB;
    }

    @Override
    public String getType() {
        return this.getClass().getSimpleName();
    }
}
