package homeWork.homework5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

// На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга. И вывести Доску. Пример вывода доски 8x8
// 0x000000
// 0000x000
// 00x00000

int posicion = 0;
            ArrayList<Integer> memoryPosicion = new ArrayList<>();

            ArrayList<Integer> row1 = new ArrayList<>(Arrays.asList(1,0,0,0,0,0,0,0));
            Collections.shuffle(row1);
            System.out.println(row1);
            posicion = row1.indexOf(1);
            memoryPosicion.add(posicion);

            ArrayList<Integer> row2 = new ArrayList<>(Arrays.asList(1,0,0,0,0,0,0,0));
            Collections.shuffle(row2);
            posicion = row2.indexOf(1);
            memoryPosicion.add(posicion);
            switch (posicion) {
                 case 0:
                    if (row1.get(posicion) ==1 || row1.get(posicion+1) ==1) {
                        Collections.shuffle(row2);
                        System.out.println(row2);
                    }else{
                        System.out.println(row2);
                    }break;
                case 1, 2, 3, 4, 5, 6:
                     if (row1.get(posicion) ==1 || row1.get(posicion+1) ==1 || row1.get(posicion-1) ==1) {
                        Collections.shuffle(row2);
                        System.out.println(row2);
                    }else{
                        System.out.println(row2);
                    }break;
                case 7:
                    if (row1.get(posicion) ==1 || row1.get(posicion-1) ==1) {
                        Collections.shuffle(row2);
                        System.out.println(row2);
                    }else{
                        System.out.println(row2);
                    }break;
        }

            ArrayList<Integer> row3 = new ArrayList<>(Arrays.asList(1,0,0,0,0,0,0,0));
            Collections.shuffle(row3);
            posicion = row3.indexOf(1);
            memoryPosicion.add(posicion);
            switch (posicion) {
                 case 0:
                    if (row2.get(posicion) ==1 || row2.get(posicion+1) ==1) {
                        Collections.shuffle(row3);
                        System.out.println(row3);
                    }else{
                        System.out.println(row3);
                    }break;
                case 1, 2, 3, 4, 5, 6:
                     if (row2.get(posicion) ==1 || row2.get(posicion+1) ==1 || row2.get(posicion-1) ==1) {
                        Collections.shuffle(row3);
                        System.out.println(row3);
                    }else{
                        System.out.println(row3);
                    }break;
                case 7:
                    if (row2.get(posicion) ==1 || row2.get(posicion-1) ==1) {
                        Collections.shuffle(row3);
                        System.out.println(row3);
                    }else{
                        System.out.println(row3);
                    }break;
        }

            ArrayList<Integer> row4 = new ArrayList<>(Arrays.asList(1,0,0,0,0,0,0,0));
            Collections.shuffle(row4);
            posicion = row4.indexOf(1);
            memoryPosicion.add(posicion);
            switch (posicion) {
                 case 0:
                    if (row3.get(posicion) ==1 || row3.get(posicion+1) ==1) {
                        Collections.shuffle(row4);
                        System.out.println(row4);
                    }else{
                        System.out.println(row4);
                    }break;
                case 1, 2, 3, 4, 5, 6:
                     if (row3.get(posicion) ==1 || row3.get(posicion+1) ==1 || row3.get(posicion-1) ==1) {
                        Collections.shuffle(row4);
                        System.out.println(row4);
                    }else{
                        System.out.println(row4);
                    }break;
                case 7:
                    if (row3.get(posicion) ==1 || row3.get(posicion-1) ==1) {
                        Collections.shuffle(row4);
                        System.out.println(row4);
                    }else{
                        System.out.println(row4);
                    }break;
        }

            ArrayList<Integer> row5 = new ArrayList<>(Arrays.asList(1,0,0,0,0,0,0,0));
            Collections.shuffle(row5);
            posicion = row5.indexOf(1);
            memoryPosicion.add(posicion);
            switch (posicion) {
                 case 0:
                    if (row4.get(posicion) ==1 || row4.get(posicion+1) ==1) {
                        Collections.shuffle(row5);
                        System.out.println(row5);
                    }else{
                        System.out.println(row5);
                    }break;
                case 1, 2, 3, 4, 5, 6:
                     if (row4.get(posicion) ==1 || row4.get(posicion+1) ==1 || row4.get(posicion-1) ==1) {
                        Collections.shuffle(row5);
                        System.out.println(row5);
                    }else{
                        System.out.println(row5);
                    }break;
                case 7:
                    if (row4.get(posicion) ==1 || row4.get(posicion-1) ==1) {
                        Collections.shuffle(row5);
                        System.out.println(row5);
                    }else{
                        System.out.println(row5);
                    }break;
        }

            ArrayList<Integer> row6 = new ArrayList<>(Arrays.asList(1,0,0,0,0,0,0,0));
            Collections.shuffle(row6);
            posicion = row6.indexOf(1);
            memoryPosicion.add(posicion);
            switch (posicion) {
                 case 0:
                    if (row5.get(posicion) ==1 || row5.get(posicion+1) ==1) {
                        Collections.shuffle(row6);
                        System.out.println(row6);
                    }else{
                        System.out.println(row6);
                    }break;
                case 1, 2, 3, 4, 5, 6:
                     if (row5.get(posicion) ==1 || row5.get(posicion+1) ==1 || row5.get(posicion-1) ==1) {
                        Collections.shuffle(row6);
                        System.out.println(row6);
                    }else{
                        System.out.println(row6);
                    }break;
                case 7:
                    if (row5.get(posicion) ==1 || row5.get(posicion-1) ==1) {
                        Collections.shuffle(row6);
                        System.out.println(row6);
                    }else{
                        System.out.println(row6);
                    }break;
        }

            ArrayList<Integer> row7 = new ArrayList<>(Arrays.asList(1,0,0,0,0,0,0,0));
            Collections.shuffle(row7);
            posicion = row7.indexOf(1);
            memoryPosicion.add(posicion);
            switch (posicion) {
                 case 0:
                    if (row6.get(posicion) ==1 || row6.get(posicion+1) ==1) {
                        Collections.shuffle(row7);
                        System.out.println(row7);
                    }else{
                        System.out.println(row7);
                    }break;
                case 1, 2, 3, 4, 5, 6:
                     if (row6.get(posicion) ==1 || row6.get(posicion+1) ==1 || row6.get(posicion-1) ==1) {
                        Collections.shuffle(row7);
                        System.out.println(row7);
                    }else{
                        System.out.println(row7);
                    }break;
                case 7:
                    if (row6.get(posicion) ==1 || row6.get(posicion-1) ==1) {
                        Collections.shuffle(row7);
                        System.out.println(row7);
                    }else{
                        System.out.println(row7);
                    }break;
        }

            ArrayList<Integer> row8 = new ArrayList<>(Arrays.asList(1,0,0,0,0,0,0,0));
            Collections.shuffle(row8);
            posicion = row8.indexOf(1);
            memoryPosicion.add(posicion);
            switch (posicion) {
                 case 0:
                    if (row7.get(posicion) ==1 || row7.get(posicion+1) ==1) {
                        Collections.shuffle(row8);
                        System.out.println(row8);
                    }else{
                        System.out.println(row8);
                    }break;
                case 1, 2, 3, 4, 5, 6:
                     if (row7.get(posicion) ==1 || row7.get(posicion+1) ==1 || row7.get(posicion-1) ==1) {
                        Collections.shuffle(row8);
                        System.out.println(row8);
                    }else{
                        System.out.println(row8);
                    }break;
                case 7:
                    if (row7.get(posicion) ==1 || row7.get(posicion-1) ==1) {
                        Collections.shuffle(row8);
                        System.out.println(row8);
                    }else{
                        System.out.println(row8);
                    }break;
        }
   }
}
// Пока моих познаний хватает, чтобы решить эту задачу только до сюда....
