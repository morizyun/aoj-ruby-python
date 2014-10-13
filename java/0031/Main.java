import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.StringBuffer;
import java.lang.System;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int goal = sc.nextInt();
            String binary = Integer.toBinaryString(goal);
            String reverse = new StringBuffer(binary).reverse().toString();

            String res = "";
            for (int i = 0; i < reverse.length(); i++) {
                if (reverse.charAt(i) == '1') {
                    res += kai2(i) + " ";
                }
            }
            System.out.println(res.trim());
        }
    }

    // 2の階乗を求める
    public static int kai2(int i) {
        int res = 1;
        for (int j = 0; j < i; j++) {
            res *= 2;
        }
        return res;
    }
}