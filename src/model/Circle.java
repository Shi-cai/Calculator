package model;

import interfaces.Controller;

public class Circle extends MyModel {
    public Circle(Controller myContorller) {
        super(myContorller);
    }

    @Override
    public Double calculateC(Double[] args) {
        Double res = args[1]*2.0*Math.PI;
        return res;
    }

    @Override
    public Double calculateBS(Double[] args) {
        Double res = args[1]*args[1]*Math.PI;
        return res;
    }
}