import java.io.IOException;
import java.lang.Integer;
import java.lang.System;
import java.util.Scanner;

public class Main{
    // インキ滴 小
    final static int size1[][] = {
            {0, 0, 0, 0, 0},
            {0, 0, 1, 0, 0},
            {0, 1, 1, 1, 0},
            {0, 0, 1, 0, 0},
            {0, 0, 0, 0, 0}
    };
    // インキ滴 中
    final static int size2[][] = {
            {0, 0, 0, 0, 0},
            {0, 1, 1, 1, 0},
            {0, 1, 1, 1, 0},
            {0, 1, 1, 1, 0},
            {0, 0, 0, 0, 0}
    };
    // インキ滴 大
    final static int size3[][] = {
            {0, 0, 1, 0, 0},
            {0, 1, 1, 1, 0},
            {1, 1, 1, 1, 1},
            {0, 1, 1, 1, 0},
            {0, 0, 1, 0, 0}
    };

    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);

        int field[][] = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                field[i][j] = 0;
            }
        }

        while(s.hasNext()) {
            String str = s.nextLine();
            String[] strNum = str.split(",");
            int x = Integer.parseInt(strNum[0]);
            int y = Integer.parseInt(strNum[1]);
            int size = Integer.parseInt(strNum[2]);

            if(size == 1) {
                field = putInk(field, x, y, size1);
            } else if(size == 2) {
                field = putInk(field, x, y, size2);
            } else if(size == 3) {
                field = putInk(field, x, y, size3);
            }
        }

        // 色のついてないマス目の数
        int count = 0;
        int maxInkPoint = -1;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (field[i][j] == 0) count++;
                if (maxInkPoint <= field[i][j]) {
                    maxInkPoint = field[i][j];
                }
            }
        }
        System.out.println(count);
        System.out.println(maxInkPoint);
    }

    // インクをフィールドに落とす
    private static int[][] putInk(int[][] field, int x, int y, int size[][]) {
        for (int i = -2; i <= 2; i++) {
            for (int j = -2; j <= 2; j++) {
                if ((x + i) >= 0 && (x + i) <= 9 && (y + j) >= 0 && (y + j) <= 9) {
                    field[x + i][y + j] += size[i + 2][j + 2];
                }
            }
        }
        return field;
    }
}
