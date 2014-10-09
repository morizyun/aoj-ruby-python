import java.io.*;
import java.lang.System;
import java.util.*;

public class Main {
    public static void main(String[] args)throws IOException{
        Scanner s = new Scanner(System.in);

        int numSet[] = new int[101];
        for (int i = 1; i < numSet.length; i++) {
            numSet[i] = 0;
        }

        while(s.hasNext()){
            int in = s.nextInt();
            numSet[in]++;
        }

        // 出現度が最大のものを求める
        int max = getMaxFreq(numSet);

        for (int i = 1; i < numSet.length; i++) {
            if (numSet[i] == max) {
                System.out.println(i);
            }
        }
    }

    public static int getMaxFreq(int[] arr) {
        int max = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
