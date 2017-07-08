import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
  private static String GOAL = "01234567";
  private static int[][] MOVE_LIST = {
      {1, 4},
      {0, 2, 5},
      {1, 3, 6},
      {2, 7},
      {0, 5},
      {1, 4, 6},
      {2, 5, 7},
      {3, 6}
  };

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Map<String, Integer> answers = breathFirstSearch();

    while (true) {
      String map = br.readLine();
      if (map == null) {
        break;
      }
      System.out.println(answers.get(removeSpace(map)));
    }
  }

  private static String removeSpace(String map) {
    String[] newMap = map.split(" ");
    return Arrays.asList(newMap).stream().collect(Collectors.joining());
  }

  private static Map<String, Integer> breathFirstSearch() {
    Map<String, Integer> answers = new HashMap<>();
    answers.put(GOAL, 0);

    Queue<String> queues = new ArrayDeque<>();
    queues.add(GOAL);

    while (true) {
      if (queues.size() == 0) {
        break;
      }

      String search = queues.remove();

      int index = search.indexOf('0');
      for (int nextId : MOVE_LIST[index]) {
        String[] newMap = search.split("");
        newMap[index] = newMap[nextId];
        newMap[nextId] = "0";
        String nextMap = Arrays.stream(newMap).collect(Collectors.joining());
        if (answers.get(nextMap) == null) {
          int count = answers.get(search);
          answers.put(nextMap, count + 1);
          queues.add(nextMap);
        }
      }
    }

    return answers;
  }
}