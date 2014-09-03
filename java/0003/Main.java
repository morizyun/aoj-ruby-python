import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.System;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] a) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(r.readLine());
        StringTokenizer st;

        int side[] = new int[3];
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(r.readLine());
            for(int j = 0; j < 3; j++) {
                side[j] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(side);
            if((side[0]*side[0] + side[1]*side[1]) == side[2]*side[2]) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}