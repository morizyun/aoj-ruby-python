import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.String;
import java.lang.System;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] a) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        try {
            String s = in.readLine();
            StringTokenizer st;
            while(s != null) {
                st = new StringTokenizer(s);
                int p = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
                System.out.println((int)Math.log10(p) + 1);
                s = in.readLine();
            }
        } catch (Exception ex) {
            System.exit(0);
        }
    }
}