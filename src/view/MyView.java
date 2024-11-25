package view;

import interfaces.View;
import controller.MyContorller;

import java.util.Scanner;

public class MyView implements View {

    private MyContorller myContorller;

    public MyView(MyContorller myContorller) {
        this.myContorller = myContorller;
    }

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("which modle?\n 1. Circle\n 2. Triangle\n 3. Cylinder\n 4.Triangular prism\n 0. exit\n");
            int option = scanner.nextInt(); option--;
            if(option == -1) 
                break;
            Double[] args = {(double)option, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0};
            for(int i = 0; i < 5; i++) {
                if(myContorller.vis[option][i]) {
                    System.out.print(myContorller.help[i] + " : ");
                    args[i + 1] = scanner.nextDouble();
                }
            }
            toController(args);
        }

        scanner.close();
    }

    @Override
    public void toController(Double[] args) {
        myContorller.fromView(args);
    }

    @Override
    public void fromController(Double[] res) {
        for(int i = 5; i < 8; i++) {
            if(myContorller.vis[res[0].intValue()][i]) {
                System.out.println(myContorller.help[i] + " : " + res[i - 4].toString());
            }
        }
        System.out.println("=================");
    }
}
