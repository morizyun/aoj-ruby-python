import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.System;

public class Main {
    public static void main(String[] a) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String s;
        int week;
        double total;

        while((s = r.readLine()) != null) {
            week = Integer.parseInt(s);
            total = 100000;
            for(int i = 0; i < week; i++) {
                total *= 1.05;
                total /= 1000;
                total = Math.ceil(total) * 1000;
            }
            System.out.printf("%.0f\n", total);
        }
    }
}