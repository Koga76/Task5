package T5;

import java.awt.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    final float pi = 3.14f;
    private static Scanner in;

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList();
        Shapes value = Shapes.RECTANGLE;
        Shapes value2 = Shapes.CIRCLE;

        Interface inner = new Interface() {
            @Override
            public void Area(int radius) {

                double area = pi * radius * radius;
                System.out.println("Area=" + area);
            }

            @Override

            public void Area(int length, int width) {
                float area = length * width;
                System.out.println("Area=" + area);

            }
        };
        System.out.println("Circle or Rectangle area?\n");
        in = new Scanner(System.in);
        String Answer= in.next();

        if (Answer.equals("circle")){
            while (true) {
                System.out.println("Enter Radius");
                int radius = in.nextInt();
                list.add(radius);
                System.out.println("Add another radius?\n y or n");
                String answer2 = in.next();

                if (answer2.equals("n")) break;

            }
            for (int i = 0; i < list.size(); i++) {
                inner.Area(list.get(i));
            }
        } else {
            System.out.println("Enter Length");
            int length = in.nextInt();
            System.out.println("Enter Width");
            int width = in.nextInt();
            inner.Area(length, width);
        }

    }
}



