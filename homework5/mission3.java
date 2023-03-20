package homeWork.homework5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

// На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга. И вывести Доску. Пример вывода доски 8x8
// 0x000000
// 0000x000
// 00x00000

public class mission3 {
    public static void main(String[] args) {
        ArrayList<Integer> row = new ArrayList<>(Arrays.asList(0, 0, 0, 1, 0, 0, 0, 0));
        int posicion = 0;
        int repead = 0;
        boolean flag = true;
        while (repead < 8){
            posicion = row.indexOf(1);
            Collections.shuffle(row);
            while (flag == true) {
                switch (posicion) {
                    case 0:
                        if (row.get(posicion) ==1 || row.get(posicion+1) ==1) {
                            Collections.shuffle(row);
                        }else{
                            flag = false;
                        }break;
                    case 1, 2, 3, 4, 5, 6:
                        if (row.get(posicion) ==1 || row.get(posicion+1) ==1 || row.get(posicion-1) ==1) {
                            Collections.shuffle(row);
                        }else{
                            flag = false;
                        }break;
                    case 7:
                        if (row.get(posicion) ==1 || row.get(posicion-1) ==1) {
                            Collections.shuffle(row);
                        }else{
                            flag = false;
                        }break;
                }
            }
            repead ++;
            flag = true;
            System.out.println(row);
        }
   }
}
