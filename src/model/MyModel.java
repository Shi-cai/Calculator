package model;

import interfaces.*;

public abstract class MyModel implements Model {
    private Controller myContorller;

    Double[] args;

    MyModel(Controller myContorller) {
        this.myContorller = myContorller;
    }

    abstract public Double calculateC(Double[] args);
    abstract public Double calculateBS(Double[] args);

    public Double calculateSS(Double[] args) {
        return calculateC(args)*args[5] + calculateBS(args)*2;
    }
    public Double calculateV(Double[] args) {
        return calculateBS(args)*args[5];
    }

    @Override
    public void run() {
        Double[] res = {args[0], calculateBS(args), calculateSS(args), calculateV(args)};
        toController(res);
    }

    @Override
    public void fromController(Double[] args) {
        this.args = args;
        run();
    }

    @Override
    public void toController(Double[] res) {
        myContorller.fromModel(res);
    }
}
