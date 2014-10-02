import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String str;

        while(true){
            str = r.readLine();

            // str = 0 の場合は処理を終了
            if (str.equals("0")) {
                break;
            }

            int n = Integer.parseInt(str);
            long sum = 0;
            long max = Long.MIN_VALUE;

            for (int i = 0; i < n; i++) {
                int a = Integer.parseInt(r.readLine());
                sum = Math.max((sum + a), a);
                max = Math.max(sum, max);
            }

            System.out.println(max);
        }
    }
}
