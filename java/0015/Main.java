import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.System;
import java.math.BigDecimal;

public class Main {
    private static int n;
    private static BigDecimal a, b, z;
    private final static int MAX_LEN = 80;

    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(r.readLine());
        for (int i = 0; i < n; i++) {
            a = new BigDecimal(r.readLine());
            b = new BigDecimal(r.readLine());
            z = a.add(b);

            if (String.valueOf(z).length() > MAX_LEN) {
                System.out.println("overflow");
            } else {
                System.out.println(z);
            }
        }
    }
}