package homeWork.homework3;

import java.util.ArrayList;

// Пусть дан произвольный список целых чисел, удалить из него чётные числа
public class mission1 {
    public static void main(String[] args) {
        
    ArrayList<Integer> myList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            myList.add((int) (Math.random()*10));
        }
        System.out.println(myList);
        myList.removeIf(i ->(i%2 ==0));
        System.out.println(myList);
    }
}