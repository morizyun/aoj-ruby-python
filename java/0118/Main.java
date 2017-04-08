import java.util.Scanner;

public class Main {
    public static final int DONE_FLAG = '.';
    public static final int[] dx = { 0, 1, 0, -1 };
    public static final int[] dy = { -1, 0, 1, 0 };

    public static int h, w;
    public static char[][] map;

    public static void depthFirstSearch(int x, int y, char target) {
        if (map[y][x] != target) {
            return;
        }

        map[y][x] = DONE_FLAG;
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx < 0 || w <= nx || ny < 0 || h <= ny) {
                continue;
            }

            depthFirstSearch(nx, ny, target);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            h = sc.nextInt();
            w = sc.nextInt();
            if (h == 0 && w == 0) {
                break;
            }
            map = new char[h][];
            for (int i = 0; i < h; i++) {
                map[i] = sc.next().toCharArray();
            }

            int count = 0;
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    char current = map[i][j];
                    if (current != DONE_FLAG) {
                        depthFirstSearch(j, i, current);
                        count++;
                    }
                }
            }

            System.out.println(count);
        }

    }

}