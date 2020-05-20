package Cw11.z1;

import Cw11.z1.Figure;

public class Parallelogram implements Figure {

    double baseSide;
    double side;
    double height;

    public Parallelogram(double baseSide, double side, double height) {
        this.baseSide = baseSide;
        this.side = side;
        this.height = height;
    }

    @Override
    public double getPerimeter() {
        return 2*(baseSide+side);
    }

    @Override
    public double getArea() {
        return baseSide*height;
    }

    @Override
    public String getType() {
        return this.getClass().getSimpleName();
    }
}
