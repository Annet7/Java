package homeWork.homework3;

import java.util.ArrayList;

// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее ариф. из этого списка.
public class mission2 {
    public static void main(String[] args) {
        
    
    ArrayList<Integer> myList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            myList.add((int) (Math.random()*10));
        }
        System.out.println(myList);
        
        int max =0;
        for (int i = 0; i < myList.size(); i++) {
            if ((myList.get(i)) > max) {
                max = myList.get(i);
            }
        }
        System.out.println(max);

        int min =0;
        for (int i = 0; i < myList.size(); i++) {
            if ((myList.get(i)) < min) {
                min = myList.get(i);
            }
        }
        System.out.println(min);

        float average = 0;
        for (int i = 0; i < myList.size(); i++) {
            average += myList.get(i);
        }
        System.out.println(average / myList.size());

}
    }
