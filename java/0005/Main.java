import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.Exception;
import java.lang.String;
import java.lang.System;

public class Main {
    public static void main(String[] a) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        long num[] = new long[2];
        long gcd, lcm;
        String numStr[] = new String[2];
        String str;

        while((str = r.readLine()) != null) {
            numStr = str.split(" ");
            for(int i = 0; i < numStr.length; i++) {
                num[i] = Long.parseLong(numStr[i]);
            }
            gcd = getGCD(num[0], num[1]);
            lcm = getLCM(num[0], num[1]);
            System.out.printf("%d %d\n", gcd, lcm);
        }
    }

    // a, bの最大公約数を求める
    private static long getGCD(long a, long b) {
        if(a > b) {
            long tmp;
            tmp = a;
            a = b;
            b = tmp;
        }

        while(a != 0) {
            long tmp = a;
            a = b%a;
            b = tmp;
        }

        return b;
    }

    // a, bの最小公倍数を求める
    private static long getLCM(long a, long b) {
        return (a * b)/getGCD(a, b);
    }
}