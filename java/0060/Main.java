import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
  final static Integer[] CARDS = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    while (true) {
      String tmp = br.readLine();
      if (tmp == null) {
        break;
      }
      List<Integer> list = Arrays.stream(tmp.split(" ")).map(x -> Integer.valueOf(x)).collect(Collectors.toList());
      List<Integer> remain = Arrays.asList(CARDS).stream().filter(x -> !list.contains(x)).collect(Collectors.toList());
      List<Integer> within20 = remain.stream().filter(x -> (x + list.get(0) + list.get(1) <= 20)).collect(Collectors.toList());
      float rate = (float) within20.size() / 7.0f;
      if (rate >= 0.5) {
        System.out.println("YES");
      } else {
        System.out.println("NO");
      }
    }
  }
}