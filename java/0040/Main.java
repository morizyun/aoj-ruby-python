import java.io.IOException;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.System;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int lineNum = sc.nextInt();
        sc.nextLine(); // Skip /n

        for (int i = 0; i < lineNum; i++) {
            String str = sc.nextLine();
            str = findEncodedString(str);
            System.out.println(str);
        }
    }

    public static String findEncodedString(String s) {
        for (int a = 1; a < 26; a++) {
            for (int b = 0; b < 26; b++) {
                String encStr = encode(s, a, b);
                for (String word : encStr.split(" ")) {
                    if (word.length() == 4) {
                        if (word.equals("this") || word.equals("that")) { return encStr; }
                    } else {
                        continue;
                    }
                }
            }
        }
        return s;
    }

    public static String encode(String s, int a, int b) {
        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if('a' <= ch && ch <= 'z') {
                int x = (a * (ch - 'a') + b) % 26;
                sb.append((char)('a' + x));
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}