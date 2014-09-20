import java.lang.System;
import java.lang.Exception;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            double xa = sc.nextDouble();
            double ya = sc.nextDouble();
            double xb = sc.nextDouble();
            double yb = sc.nextDouble();
            double xc = sc.nextDouble();
            double yc = sc.nextDouble();

            double a = 2*(xb - xa);
            double b = 2*(yb - ya);
            double c = xa*xa - xb*xb + ya*ya - yb*yb;
            double d = 2*(xc - xa);
            double e = 2*(yc - ya);
            double f = xa*xa - xc*xc + ya*ya - yc*yc;

            double xp = (b*f - c*e) / (e*a - b*d);
            double yp = (d*c - a*f) / (e*a - b*d);
            double r = Math.sqrt((xa - xp)*(xa - xp) + (ya - yp)*(ya - yp));
            System.out.printf("%.3f %.3f %.3f\n", xp, yp, r);
        }
    }
}