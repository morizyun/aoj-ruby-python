import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;

class Main {
    static final int TABLE_SIZE = 5;

    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(r.readLine());
        String[] str = r.readLine().split(" ");

        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }

        LinkedList<Integer>[] listTable = generateHashedTable(arr);

        int q = Integer.parseInt(r.readLine());
        String[] str2 = r.readLine().split(" ");

        Integer[] arr2 = new Integer[q];
        for(int i = 0; i < q; i++) {
            arr2[i] = Integer.parseInt(str2[i]);
        }

        int count = 0;
        for(Integer v: arr2) {
            if (search(listTable, v)) {
                count ++;
            }
        }

        System.out.println(count);
    }

    private static LinkedList<Integer>[] generateHashedTable(Integer[] arr) {
        @SuppressWarnings("unchecked")
        LinkedList<Integer>[] listTable = (LinkedList<Integer>[]) new LinkedList[TABLE_SIZE];

        for (Integer v : arr) {
            int h = generateHash(v);
            if (listTable[h] == null) {
                listTable[h] = new LinkedList<>();
            }

            LinkedList<Integer> list = listTable[h];
            list.add(v);
        }

        return listTable;
    }

    private static boolean search(LinkedList<Integer>[] listTable, Integer searchNum) {
        int h = generateHash(searchNum);

        LinkedList<Integer> list = listTable[h];
        if (list == null) { return false; }

        return list.contains(searchNum);
    }

    private static int generateHash(Integer v) {
        int h = v.hashCode();
        if (h < 0) {  h = 0 - h; }
        return h % TABLE_SIZE;
    }
}
