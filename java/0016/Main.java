import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.Integer;
import java.lang.Math;
import java.lang.System;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        Walker walker = new Walker();
        String str;
        while ((str = r.readLine()) != null) {
            String input[] = str.split(",");
            int step = Integer.parseInt(input[0]);
            int angle = Integer.parseInt(input[1]);

            if (step == 0 && angle == 0) {
                break;
            }

            walker.walk(step);
            walker.turn(angle);
        }

        System.out.println(walker.getX());
        System.out.println(walker.getY());
    }
}

class Walker {
    static double x, y;
    static int angle;

    Walker() {
        x = 0;
        y = 0;
        angle = 0;
    }

    static void walk(int step) {
        double t = Math.PI*angle/180.0;
        x += step * Math.sin(t);
        y += step * Math.cos(t);
    }

    static void turn(int th) {
        angle += th;
    }

    static int getX() {
        return (int)x;
    }

    static int getY() {
        return (int)y;
    }
}