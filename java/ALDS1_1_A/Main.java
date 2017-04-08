import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.System;

class Main {
    public static void main(String[] a) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(r.readLine());
        String[] str = r.readLine().split(" ");

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }

        int v, j;
        printArray(n, arr);
        for (int i = 1; i < n; i++) {
            v = arr[i];
            j = i - 1;
            while (j >= 0 && arr[j] > v) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = v;
            printArray(n, arr);
        }
    }

    private static void printArray(int n, int[] arr) {
        StringBuilder s;
        s = new StringBuilder();
        for (int i = 0; i < n; i++) {
            s.append(arr[i]);
            if (i != n -1) { s.append(" "); }
        }
        System.out.println(s);
    }
}
