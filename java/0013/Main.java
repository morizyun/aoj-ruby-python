import java.lang.System;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedList<Integer> queue = new LinkedList<Integer>();
        while (sc.hasNextInt()) {
            int n = sc.nextInt();

            if (n > 0) {
                queue.push(n);
            } else {
                System.out.println(queue.pop());
            }
        }
    }
}