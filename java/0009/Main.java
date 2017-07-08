import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int[] primeCountList = calcPrimeNumber();

    while (true) {
      String tmp = br.readLine();
      if (tmp == null) {
        break;
      }
      int num = Integer.valueOf(tmp);
      System.out.println(primeCountList[num]);
    }
  }

  private static int[] calcPrimeNumber() {
    int maxN = 1_000_000;
    int sqrtN = (int) Math.sqrt(maxN);

    boolean[] isPrimeList = new boolean[maxN];
    for (int i = 2; i < maxN; i++) {
      isPrimeList[i] = true;
    }

    for(int i = 2; i < sqrtN + 1; i++) {
      if (!isPrimeList[i]) {
        continue;
      }
      for (int j = i*i; j <maxN; j += i) {
        isPrimeList[j] = false;
      }
    }

    int[] primeCountList = new int[maxN];
    int count = 0;
    for (int i = 2; i < maxN; i++) {
      if (isPrimeList[i]) {
        count++;
      }
      primeCountList[i] = count;
    }

    return primeCountList;
  }
}
