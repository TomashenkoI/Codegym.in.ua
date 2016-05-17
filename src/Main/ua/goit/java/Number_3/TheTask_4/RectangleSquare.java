package Main.ua.goit.java.Number_3.TheTask_4;

import java.util.ArrayList;

/**
 * Created by 7 on 16.05.2016.
 */
public class RectangleSquare {
    public int measure(int[] x, int[] h, int[] w) {
        int square = 0;
        int totalArea = 0;

        ArrayList<Integer> squares = new ArrayList<>();
        for (int i = 0; i < x.length; i++) {
            int h1 = h[i];
            int w1 = w[i];
            if (x[i] > 0) w1 -= x[i];
            if (i == 0) {
                square = h1*w1;
                squares.add(square);
            } else {
                if (h1 < h[0]) {
                    if (w1 > w[0]) {
                        square = h1 * (w1 - w[0]);
                        squares.add(square);
                    }
                }
                if (w1 < w[0]) {
                    if (h1 > h[0]) {
                        square = w1 * (h1 - h[0]);
                        squares.add(square);
                    }
                }
            }
        }
        for (int i = 0; i < squares.size(); i++) {
            totalArea += squares.get(i);
        }
        return totalArea;
    }


    public static void main(String[] args) {
        RectangleSquare rectangleSquare = new RectangleSquare();
        int[] x = {0, 10};
        int[] h = {10, 10};
        int[] w = {10, 10};

        int totalArea =rectangleSquare.measure(x,h,w);

    }
}
