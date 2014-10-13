import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    static int count;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            count = 0;
            int n = sc.nextInt();
            int s = sc.nextInt();
            if (n == 0 && s == 0) { break; }

            solve(0, n, s);
            System.out.println(count);
        }
    }

    // p: 加算する数字
    // n: 加算する数字の数
    // s: 目標の合計値
    static void solve(int p, int n, int s) {
        if (p > 9 || n == 0 || p > s) {
            return;
        }
        if (n == 1 && p == s) {
            count++;
        }
        solve(p + 1, n - 1, s - p);
        solve(p + 1, n, s);
    }
}