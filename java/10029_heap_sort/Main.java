import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] a) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(r.readLine());
        String[] str = r.readLine().split(" ");

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }

        arr = buildHeap(arr);

        for (int i = n - 1; i >= 1; i--) {
            swap(arr, i);
            heapify(arr, 0, i);
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

    private static int[] buildHeap(int[] arr) {
        int[] result = new int[arr.length];
        for (int i = arr.length/2 - 1; i >= 0; i--) {
            result = heapify(arr, i, arr.length);
        }
        return result;
    }

    private static int[] heapify(int[] arr, int index, int maxIndex) {
        int leftIndex = 2 * index + 1;
        int rightIndex = 2 * index + 2;

        int largestIndex = index;
        if (leftIndex < maxIndex && arr[leftIndex] > arr[index]) {
            largestIndex = leftIndex;
        }

        if (rightIndex < maxIndex  && arr[rightIndex] > arr[largestIndex]) {
            largestIndex = rightIndex;
        }

        if (largestIndex != index) {
            swap(arr, index);
            heapify(arr, largestIndex, maxIndex);
        }

        return arr;
    }

    private static void swap(int[] arr, int i) {
        int tmp = arr[0];
        arr[0] = arr[i];
        arr[i] = tmp;
    }
}
