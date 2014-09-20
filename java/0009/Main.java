import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Math;
import java.lang.System;

public class Main {
    public static void main(String[] a) throws Exception {
        int maxNum = 1000000;
        boolean primeList[] = new boolean[maxNum];
        primeList = getPrimeList(maxNum);

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String s;
        long n, count;
        while ((s = r.readLine()) != null) {
            count = 0;
            n = Integer.parseInt(s);
            for(int i = 1; i <= n; i++) {
                if (primeList[i]) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }

    public static boolean[] getPrimeList(int maxNum) {
        double dn = Math.sqrt((double)maxNum);
        long sqrtNum = (int)dn + 1;
        boolean primeList[] = new boolean[maxNum];

        for(int i = 0; i < maxNum; i++) {
            if (i <= 1) {
                primeList[i] = false;
            } else {
                primeList[i] = true;
            }
        }

        for (int i = 2; i < sqrtNum; i++) {
            for (int j = i*i; j < maxNum; j += i) {
                primeList[j] = false;
            }
        }

        return primeList;
    }
}