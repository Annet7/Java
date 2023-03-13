package homeWork.homework2;
// Реализуйте алгоритм сортировки пузырьком числового массива (введён вами), результат после каждой итерации запишите в лог-файл.

import java.io.File;
import java.io.FileWriter;
import java.util.Arrays;

public class mission1 {
    public static void main(String[] args) {
    int[] myArr = {5,1,2,3,4};

    String fileName = "log.txt";
    File  file = new File(fileName);

    int item = 0;
    boolean isSorted = false;
    while(!isSorted) {
        isSorted = true;
    for (int i = 0; i < myArr.length - 1; i++) {
        if (myArr[i] > myArr[i+1]){
            item = myArr[i];
            myArr[i] = myArr[i+1];
            myArr[i+1] = item;
            try{
                String strMyArr = Arrays.toString(myArr);
                FileWriter writer = new FileWriter(file, true);    
                writer.write(strMyArr);
                writer.write(" ");    
                writer.close();
        }
        catch(Exception e){
            System.out.println("ЧТО-ТО ПОШЛО НЕ ТАК...");
        }    
        }        
    }
    System.out.println(Arrays.toString(myArr));
        }
    }
}
