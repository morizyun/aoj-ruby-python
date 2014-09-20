import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.System;

public class Main {
    public static void main(String[] a) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        String s;
        int n, count;

        while ((s = r.readLine()) != null) {
            count = 0;
            n = Integer.parseInt(s);
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    for (int k = 0; k < 10; k++) {
                        for (int m = 0; m < 10; m ++) {
                            if ((i + j + k + m) == n) {
                                count++;
                            }
                        }
                    }
                }
            }
            System.out.println(count);
        }
    }
}