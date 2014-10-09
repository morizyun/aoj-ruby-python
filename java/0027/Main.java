import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws IOException{
        Scanner s = new Scanner(System.in);

        int[] tmp = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        String[] week_day = { "Wednesday", "Thursday", "Friday", "Saturday", "Sunday", "Monday", "Tuesday" };

        while(s.hasNext()){
            int in_month = s.nextInt();
            int in_day = s.nextInt();
            if(in_month == 0 && in_day == 0) break;

            int sum_day = 0;
            for (int i = 0; i < in_month - 1; i++) {
                sum_day += tmp[i];
            }
            sum_day += in_day;

            int week_num = sum_day % 7;
            System.out.println(week_day[week_num]);
        }
    }
}
