import java.lang.StringBuffer;
import java.lang.System;

class Main {
    public static void main(String[] a) {
        for(int i = 1; i < 10; i++) {
            for(int j = 1; j < 10; j++) {
                StringBuffer str = new StringBuffer();
                str.append(i);
                str.append("x");
                str.append(j);
                str.append("=");
                str.append(i*j);
                System.out.println(str.toString());
            }
        }
    }
}