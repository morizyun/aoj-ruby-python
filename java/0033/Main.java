import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    for (int i = 0; i < n; i++) {
      String tmp = br.readLine();
      String[] strArray = tmp.split(" ");
      List<Integer> intList = Arrays.asList(strArray).stream().map(s -> Integer.valueOf(s)).collect(Collectors.toList());
      ArrayList<Integer> arr1 = new ArrayList<>();
      ArrayList<Integer> arr2 = new ArrayList<>();

      for (Integer item : intList) {
        if (arr1.isEmpty() || arr1.get(arr1.size() - 1) < item) {
          arr1.add(item);
        } else if (arr2.isEmpty() || arr2.get(arr2.size() - 1) < item) {
          arr2.add(item);
        } else {
          break;
        }
      }

      if (arr1.size() + arr2.size() == intList.size()) {
        System.out.println("YES");
      } else {
        System.out.println("NO");
      }
    }
  }
}
