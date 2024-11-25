package model;

import interfaces.Controller;

public class Triangle extends MyModel {
    public Triangle(Controller myContorller) {
        super(myContorller);
    }

    @Override
    public Double calculateC(Double[] args) {
        Double res = args[2] + args[3] + args[4];
        return res;
    }

    @Override
    public Double calculateBS(Double[] args) {
        Double halfC = (args[2] + args[3] + args[4])/2.0;
        Double res = Math.sqrt(halfC*(halfC - args[2])*(halfC - args[3])*(halfC - args[4]));
        return res;
    }
}