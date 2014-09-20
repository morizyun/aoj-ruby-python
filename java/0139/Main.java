import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.Integer;
import java.lang.System;
import java.lang.Exception;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        Pattern a = Pattern.compile(">'(=+)#\\1~");
        Pattern b = Pattern.compile(">\\^(Q=)+~~");

        int n = Integer.parseInt(r.readLine());
        for (int i = 0; i < n; i++) {
            String s = r.readLine();
            Matcher ma = a.matcher(s);
            Matcher mb = b.matcher(s);
            if (ma.matches()) {
                System.out.println("A");
            } else if (mb.matches()) {
                System.out.println("B");
            } else {
                System.out.println("NA");
            }
        }
    }
}
