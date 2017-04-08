import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    private static final int maxNumber = 1_000_000;

    public static void main(String[] args) throws Exception {
        int[] primeNumberCount = calcPrimeNumberCount();

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        int num;
        String str;
        while((str = r.readLine()) != null) {
            num = Integer.parseInt(str);
            System.out.println(primeNumberCount[num]);
        }
    }

    private static int[] calcPrimeNumberCount() {
        boolean[] isPrime = new boolean[maxNumber];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;

        int sqrtMaxNum = (int) Math.floor(Math.sqrt(maxNumber));
        for (int i = 2; i < sqrtMaxNum; i++) {
            for (int j = i*i; j < maxNumber; j += i) {
                if (!isPrime[j]) { continue; }
                isPrime[j] = false;
            }
        }

        int count = 0;
        int[] primeCount = new int[maxNumber];
        for (int i = 0; i < maxNumber; i++) {
            if (isPrime[i]) {
                count ++;
            }
            primeCount[i] = count;
        }

        return primeCount;
    }
}
