import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.Exception;
import java.lang.System;

public class Main {
    public static void main(String[] a) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String s;

        while((s = r.readLine()) != null) {
            for(int i = s.length() - 1; i >= 0; i--) {
                System.out.print(s.charAt(i));
            }
            System.out.print("\n");
        }
    }
}
