import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.System;
import java.util.ArrayList;

class Main {
    public static void main(String[] a) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(r.readLine());
        String tmp = r.readLine();
        String[] str = tmp.split(" ");

        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(Integer.parseInt(str[i]));
        }

        ArrayList<Integer> result = quickSort(arr);
        printArrayList(result);
    }

    private static void printArrayList(ArrayList<Integer> result) {
        StringBuilder st = new StringBuilder();
        for (int i = 0; i < result.size(); i++) {
            st.append(result.get(i));
            if (i != result.size() - 1) {
                st.append(" ");
            }
        }
        System.out.println(st);
    }

    private static ArrayList<Integer> quickSort(ArrayList<Integer> inputArray) {
        if (inputArray.size() <= 1) {
            return inputArray;
        }

        int half = inputArray.size()/2;
        ArrayList<Integer> left = new ArrayList<>();
        ArrayList<Integer> right = new ArrayList<>();

        for (int i = 0; i < inputArray.size(); i++) {
            if (i == half) {
                continue;
            } else if (inputArray.get(half) > inputArray.get(i)) {
                left.add(inputArray.get(i));
            } else {
                right.add(inputArray.get(i));
            }
        }

        ArrayList<Integer> r = quickSort(left);
        r.add(inputArray.get(half));
        r.addAll(quickSort(right));
        return r;
    }
}
