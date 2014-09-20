import java.lang.System;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            int d = sc.nextInt();
            int sum = 0;
            for (int i = d; i <= (600 - d); i += d) {
                sum += i*i*d;
            }
            System.out.println(sum);
        }
    }
}