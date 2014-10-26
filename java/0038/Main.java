import java.io.IOException;
import java.lang.Integer;
import java.lang.String;
import java.lang.System;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()) {
            String str = sc.nextLine();
            String str_arr[] = str.split(",");

            // 配列の初期化
            int cards[] = new int[13];
            for (int i = 0; i < cards.length; i++) {
                cards[i] = 0;
            }

            // 枚数をカウント
            for (int i = 0; i < str_arr.length; i++) {
                int num = Integer.parseInt(str_arr[i]);
                cards[num-1]++;
            }

            if (isFourCard(cards)) {
                System.out.println("four card");
            } else if(isFullHouse(cards)) {
                System.out.println("full house");
            } else if(isStraight(cards)) {
                System.out.println("straight");
            } else if(isThreeCard(cards)) {
                System.out.println("three card");
            } else if(isTwoPair(cards)) {
                System.out.println("two pair");
            } else if(isOnePair(cards)) {
                System.out.println("one pair");
            } else {
                System.out.println("null");
            }
        }
    }

    public static boolean isFourCard(int[] cards) {
        for (int i = 0; i < cards.length; i++) {
            if (cards[i] == 4) return true;
        }
        return false;
    }

    public static boolean isFullHouse(int[] cards) {
        if (isThreeCard(cards) && isOnePair(cards)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isStraight(int[] cards) {
        // 配列から文字列に変換
        String card_str = arrayToString(cards);

        String regex1 = "1{5}";
        Pattern p1 = Pattern.compile(regex1);
        Matcher m1 = p1.matcher(card_str);
        if (m1.find()) { return true; }

        String regex2 = "10{8}1{4}";
        Pattern p2 = Pattern.compile(regex2);
        Matcher m2 = p2.matcher(card_str);
        if (m2.find()) {
            return true;
        }

        return false;
    }

    public static boolean isThreeCard(int[] cards) {
        for (int i = 0; i < cards.length; i++) {
            if (cards[i] == 3) return true;
        }
        return false;
    }

    public static boolean isTwoPair(int[] cards) {
        int count = 0;
        for (int i = 0; i < cards.length; i++) {
            if (cards[i] == 2) count ++;
        }

        if (count == 2) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isOnePair(int[] cards) {
        for (int i = 0; i < cards.length; i++) {
            if (cards[i] == 2) return true;
        }
        return false;
    }

    public static String arrayToString(int[] cards) {
        String res = "";

        for (int i = 0; i < cards.length; i++) {
            res += cards[i];
        }

        return res;
    }
}