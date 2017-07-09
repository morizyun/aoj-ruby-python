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

    long[][] dp = new long[n][21];
    dp[0][arr[0]] = 1;

    for (int i = 1; i < n - 1; i++) {
      for (int j = 0; j < 21; j++) {
        if (dp[i-1][j] <= 0) {
          continue;
        }

        if (j + arr[i] <= 20) {
          dp[i][j + arr[i]] += dp[i-1][j];
        }

        if (j - arr[i] >= 0) {
          dp[i][j - arr[i]] += dp[i-1][j];
        }
      }
    }

    int answer = arr[n-1];
    long count = dp[n-2][answer];
    System.out.println(count);
  }
}