import java.io.IOException;
import java.lang.System;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);

        while (s.hasNext()) {
            int a[] = new int[4];
            for (int i = 0; i < 4; i++) a[i] = s.nextInt();

            int b[] = new int[4];
            for (int i = 0; i < 4; i++) b[i] = s.nextInt();

            int hit = 0;
            int blow = 0;
            for(int i = 0; i < 4; i++){
                for(int j = 0; j < 4; j++){
                    if(a[i] == b[j] && i == j) hit++;
                    else if(a[i] == b[j]) blow++;
                }
            }

            System.out.println(hit + " " + blow);
        }
    }
}