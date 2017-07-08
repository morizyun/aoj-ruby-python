import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main (String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] s = new int[n];
    String[] tmpS = br.readLine().split(" ");
    for(int i = 0; i < n; i++) {
      s[i] = Integer.parseInt(tmpS[i]);
    }
    tmpS = null;

    int q = Integer.parseInt(br.readLine());
    int[] t = new int[q];
    String[] tmpT = br.readLine().split(" ");
    for (int i = 0; i < q; i++) {
      t[i] = Integer.parseInt(tmpT[i]);
    }
    tmpT = null;

    int count = 0;
    for(int i : t) {
      if (binarySearch(s, i)) {
        count++;
      }
    }
    System.out.println(count);
  }

  private static boolean binarySearch(int[] array, int target) {
    int left = 0;
    int right = array.length;
    while (left < right) {
      int mid = (left + right) / 2;
      int temp = array[mid];
      if (target < temp) {
        right = mid;
        continue;
      }
      if (temp < target) {
        left = mid + 1;
        continue;
      }
      return true;
    }
    return false;
  }
}