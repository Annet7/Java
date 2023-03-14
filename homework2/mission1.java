package homeWork.homework2;
// Реализуйте алгоритм сортировки пузырьком числового массива (введён вами), результат после каждой итерации запишите в лог-файл.

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class mission1 {
    public static void main(String[] args) {
    int[] myArr = new int[10];
    for (int i = 0; i < myArr.length; i++) {
    myArr[i] = (int)(Math.random() * 10);
    System.out.println(myArr);
}

    String fileName = "log.txt";
    File  file = new File(fileName);

    int item = 0;
    boolean isSorted = false;
    while(!isSorted) {
        isSorted = true;
    for (int i = 0; i < myArr.length - 1; i++) {
        if (myArr[i] > myArr[i+1]){
            isSorted = false;
            item = myArr[i];
            myArr[i] = myArr[i+1];
            myArr[i+1] = item;
            // Подскажите, пожалуйста, если делаю вот таким "примитивным" методом, то все работает, а если пытаюсь также, как Вы показывали на семинаре (строки 54-70), то создается пустой журнал логов.
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

/**
 * Innermission1
 */
// public class lg {
//     public static void main(String[] args) throws IOException{
//         Logger ll = Logger.getLogger(lg.class.getName());
//         String logsPath = "log.txt";
//         FileHandler fh = new FileHandler(logsPath, false);
//         ll.addHandler(fh);
//         SimpleFormatter formatter = new SimpleFormatter();
//         fh.setFormatter(formatter);
//         Random rand = new Random();
//         for (int i = 0; i <5; i++) {
//             int a = rand.nextInt(10);
//             ll.log(Level.INFO, "element: " + a);
//         }
//         ll.log(Level.WARNING, "logger off");
//         ll.info("test");
//         ll.warning("logsPath");
//     }
    
}
}
    

