package controller;

import interfaces.*;
import view.MyView;
import model.*;

public class MyContorller implements Controller {
    View myView;
    Model[] myModle;
    public String[] help = {"r", "a", "b", "c", "h", "Base Area", "Surface area", "Volume"};
    public boolean[][] vis = {
        {true, false, false, false, false, true, false, false},
        {false, true, true, true, false, true, false, false},
        {true, false, false, false, true, true, true, true},
        {false, true, true, true, true, true, true, true}
    };

    public MyContorller() {
        this.myView = new MyView(this);
        this.myModle = new MyModel[2];
        myModle[0] = new Circle(this);
        myModle[1] = new Triangle(this);
    }

    @Override
    public void run() {
        myView.run();
    }

    @Override
    public void fromView(Double args[]) {
        myModle[args[0].intValue()%2].fromController(args);
    }

    @Override
    public void toView(Double[] res) {
        myView.fromController(res);
    }

    @Override
    public void fromModel(Double[] res) {
        toView(res);
    }

    @Override
    public void toModel(Double[] args) {
        myModle[args[0].intValue()].fromController(args);
    }
}
