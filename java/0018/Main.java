import java.lang.String;
import java.lang.System;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int input[] = new int[5];
            for(int i = 0; i < 5; i++) {
                input[i] = sc.nextInt();
            }

            // 並び替え
            Arrays.sort(input);

            // 配列 => String
            String outStr = "";
            for(int i = input.length; i > 0; i--) {
                outStr += input[i - 1];
                if(i != 1) {
                    outStr += " ";
                }
            }
            System.out.println(outStr);
        }
    }
}
