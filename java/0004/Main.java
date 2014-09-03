import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.StringBuffer;
import java.lang.System;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] a) {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        double num[] = new double[6];
        String s, tmp[];
        double x, y;
        try {
            while((s = r.readLine()) != null) {
                tmp = s.split(" ");
                for (int i = 0; i < 6; i++) {
                    num[i] = Double.parseDouble(tmp[i]);
                }

                y = (num[0]*num[5] - num[2]*num[3])/(num[0]*num[4] - num[1]*num[3]);
                x = (num[2] - num[1]*y)/num[0];

                System.out.printf("%4.3f %4.3f\n", x, y);
            }
        } catch (Exception ex) {
            System.exit(0);
        }
    }
}