import java.io.IOException;
import java.lang.Integer;
import java.lang.System;
import java.util.Scanner;

public class Main {
    final static int[][] A = {
            {1,1,0,0},
            {1,1,0,0},
            {0,0,0,0},
            {0,0,0,0},
    };
    final static int[][] B = {
            {1,0,0,0},
            {1,0,0,0},
            {1,0,0,0},
            {1,0,0,0},
    };
    final static int[][] C = {
            {1,1,1,1},
            {0,0,0,0},
            {0,0,0,0},
            {0,0,0,0},
    };
    final static int[][] D = {
            {0,1,0,0},
            {1,1,0,0},
            {1,0,0,0},
            {0,0,0,0},
    };
    final static int[][] E = {
            {1,1,0,0},
            {0,1,1,0},
            {0,0,0,0},
            {0,0,0,0},
    };
    final static int[][] F = {
            {1,0,0,0},
            {1,1,0,0},
            {0,1,0,0},
            {0,0,0,0},
    };
    final static int[][] G = {
            {0,1,1,0},
            {1,1,0,0},
            {0,0,0,0},
            {0,0,0,0},
    };

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int[][] fields = new int[8][8];

        while (sc.hasNext()) {
            for (int i = 0; i < 8; i++) {
                String tmp = sc.nextLine();
                for (int j = 0; j < 8; j++) {
                    fields[i][j] = Integer.parseInt(String.valueOf(tmp.charAt(j)));
                }
            }

            if (hasFigure(fields, A)) {
                System.out.println("A");
            } else if (hasFigure(fields, B)) {
                System.out.println("B");
            } else if (hasFigure(fields, C)) {
                System.out.println("C");
            } else if (hasFigure(fields, D)) {
                System.out.println("D");
            } else if (hasFigure(fields, E)) {
                System.out.println("E");
            } else if (hasFigure(fields, F)) {
                System.out.println("F");
            } else if (hasFigure(fields, G)) {
                System.out.println("G");
            }

            // 空白行をスキップする
            if (sc.hasNext()) {
                sc.nextLine();
            }
        }
    }

    public static boolean hasFigure(int[][] field, int[][] figure) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (field[i][j] == figure[0][0]) {
                    for (int k = 0; k < 4; k++) {
                        for (int m = 0; m < 4; m++) {
                            if (isMatch(field, figure, i, j)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public static boolean isMatch(int[][] field, int[][] figure, int sx, int sy) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if ((sx + i >= 8 || sy + j >= 8)) {
                    if (figure[i][j] != 0) {
                        return false;
                    } else {
                        continue;
                    }
                }

                if (field[sx + i][sy + j] != figure[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}