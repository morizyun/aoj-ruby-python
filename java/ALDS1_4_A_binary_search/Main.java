import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(r.readLine());

        String[] strArray = r.readLine().split(" ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(strArray[i]);
        }
        Arrays.sort(arr);

        int q = Integer.parseInt(r.readLine());
        String[] strArray2 = r.readLine().split(" ");
        int [] searchArray = new int[q];
        for (int i = 0; i < q; i++) {
            searchArray[i] = Integer.parseInt(strArray2[i]);
        }

        int count = 0;
        for (int searchNum : searchArray) {
            if (binarySearch(arr, searchNum)) {
                count++;
            }
        }

        System.out.println(count);
    }

    private static boolean binarySearch(int[] arr, int searchNum) {
        int half = arr.length / 2;
        if (arr[half] == searchNum) {
            return true;
        } else if (arr.length <= 1) {
            return false;
        } else if (arr[half] > searchNum) {
            int[] left = Arrays.copyOfRange(arr, 0, half);
            return binarySearch(left, searchNum);
        } else {
            int[] right = Arrays.copyOfRange(arr, half, arr.length);
            return binarySearch(right, searchNum);
        }
    }
}
