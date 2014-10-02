import java.lang.String;
import java.lang.System;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int n = sc.nextInt();
            int sum = 1;
            for(int i = 2; i <= n; i++) {
                sum *= i;
            }

            System.out.println(sum);
        }
    }
}
