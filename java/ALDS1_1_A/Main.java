import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    String[] tmp = br.readLine().split(" ");
    int[] arr = Arrays.asList(tmp).stream().mapToInt(x -> Integer.parseInt(x)).toArray();

    printIntArray(arr);
    for (int i = 1; i < n; i++) {
      int v = arr[i];
      int j = i - 1;
      while (j >= 0 && arr[j] > v) {
        arr[j + 1] = arr[j];
        j--;
      }
      arr[j + 1] = v;
      printIntArray(arr);
    }
  }

  private static void printIntArray(int[] arr) {
    StringBuilder s = new StringBuilder();
    for (int i = 0; i < arr.length; i++) {
      s.append(arr[i]);
      if (i < arr.length - 1) {
        s.append(" ");
      }
    }
    System.out.println(s.toString());
  }
}