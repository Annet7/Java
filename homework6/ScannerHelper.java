package homeWork.homework6;

import java.util.*;

public class ScannerHelper {
    private final static Scanner READER = new Scanner(System.in);
    private final static Random RANDOM = new Random();

    public static int getIntFromInput(String text) {
        boolean ifInputError = true;
        int number = 0;
        System.out.print(text);
        while (ifInputError) {
            if (READER.hasNextInt()) {
                number = READER.nextInt();
                ifInputError = false;
            }
            else {
                System.out.print("ОШИБКА! " + text);
                READER.next();
            }
        }
        return number;
    }

    public static String getIntFromString(String text) {
        boolean ifInputError = true;
        String str = "";
        System.out.print(text);
        while (ifInputError) {
            if (READER.hasNext()) {
                str = READER.next();
                ifInputError = false;
            }
            else {
                System.out.print("ОШИБКА! " + text);
                READER.next();
            }
        }
        return str;
    }

    public static String getArithmeticSign(String text) {
        boolean ifInputError = true;
        String sign = "";
        System.out.print(text);
        while (ifInputError) {
            if (READER.hasNext()) {
                sign = READER.nextLine();
                ifInputError = false;
            }
            else {
                System.out.print("ОШИБКА! " + text);
                READER.next();
            }
        }
        return sign;
    }

    public static void close() {
        READER.close();
    }

    public static int[] fillArr(int[] a, int start, int end) {
        for (int i = 0; i < a.length; i++) {
            a[i] = RANDOM.nextInt((end -start) + 1) + start;
        }
        return a;
    }

    public static ArrayList<Integer> fillListRandomNum(ArrayList<Integer> list, int start, int end){
        for (int i = 0; i < 10; i++) {
            int num = RANDOM.nextInt((end -start) + 1) + start;
            list.add(num);
        }
        return list;
    }

    public static List<Integer> createAndFillListRandom(int num) {
        List<Integer> myList = new LinkedList<>();
        for (int i = 0; i < num; i++) {
            myList.add(RANDOM.nextInt(30));
        }
        return myList;
    }
}
