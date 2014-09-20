import java.lang.System;
import java.lang.Exception;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\\D");

        int w = sc.nextInt();
        int[] ans = new int[w];
        for (int i = 0; i < w; i++) {
            ans[i] = i + 1;
        }

        // 並び替え
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int tmp = ans[a - 1];
            ans[a - 1] = ans[b - 1];
            ans[b - 1] = tmp;
        }

        // 並び替え結果の出力
        for (int answer: ans) {
            System.out.println(answer);
        }
    }
}