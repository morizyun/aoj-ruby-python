import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.lang.*;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Math;
import java.lang.String;
import java.lang.System;
import java.util.StringTokenizer;


class Main {
    public static void main(String[] a) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        try {
            String s = r.readLine();
            StringTokenizer st;
            while(s != null) {
                st = new StringTokenizer(s);
                int sum = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
                System.out.println((int)Math.log10(sum) + 1);
                s = r.readLine();
            }
        } catch (Exception e) {
            System.exit(0);
        }
    }
}
