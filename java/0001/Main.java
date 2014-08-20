import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.String;
import java.lang.System;
import java.util.Arrays;

class Main {
    public static void main(String[] a) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int [] mountains = new int[10];
        int i = 0;
        while (true) {
            String s = r.readLine();
            mountains[i++] = Integer.valueOf(s);
            if(i >= 10) break;
        }
        Arrays.sort(mountains);
        for(i = 9; i > 6; i--) {
            System.out.println(mountains[i]);
        }
    }
}