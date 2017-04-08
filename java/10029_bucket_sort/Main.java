import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] a) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(r.readLine());
        String[] str = r.readLine().split(" ");

        int[] arr = strToIntArray(str);
        int maxValue = maxValue(arr);

        int[] bucket = new int[maxValue + 1];
        for (int i = 0; i < n; i++) {
            bucket[arr[i]] += 1;
        }

        int index = 0;
        for (int i = 0; i < bucket.length; i++) {
            while (bucket[i] > 0) {
                arr[index] = i;
                bucket[i] --;
                index ++;
            }
        }

        StringBuilder s = new StringBuilder();
        for (int i = 0; i < n; i++) {
            s.append(arr[i]);
            if (i != n - 1) {
                s.append(" ");
            }
        }

        System.out.println(s);
    }

    private static int[] strToIntArray(String[] str) {
        int[] arr = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        return arr;
    }

    private static int maxValue(int[] arr) {
        int max = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}

