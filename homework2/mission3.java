package homeWork.homework2;

import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
// 4*. К калькулятору из предыдущего дз добавить логирование.
public class mission3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        float firstNumber = in.nextFloat();
        System.out.print("Что хотите сделать с числами? ");
        String action = in.next();
        System.out.print("Введите второе число: ");
        int secondNumber = in.nextInt();
        in.close();

        String fileName = "logCalc.txt";
        File  file = new File(fileName);
        float result = 0;

        try{
            FileWriter writer = new FileWriter(file, true);    
        

        switch(action){
            case "/": 
                result = firstNumber / secondNumber;
                System.out.println(result);
                String str = Float.toString(result);
                writer.write(firstNumber+ action +secondNumber+ "=" +str);
                writer.write(" ");
                break;
            case "*": 
                result = firstNumber * secondNumber;
                System.out.println(result);
                str = Float.toString(result);
                writer.write(firstNumber+ action +secondNumber+ "=" +str);
                writer.write(" ");
                break;
            case "-": 
                result = firstNumber - secondNumber;
                System.out.println(result);
                str = Float.toString(result);
                writer.write(firstNumber+ action +secondNumber+ "=" +str);
                writer.write(" ");
                break;
            case "+":
                result = firstNumber + secondNumber;
                System.out.println(result);
                str = Float.toString(result);
                writer.write(firstNumber+ action +secondNumber+ "=" +str);
                writer.write(" ");
            
        }
    writer.close();
    }
    catch(Exception e){
    System.out.println("Что-то пошло не так.");
    }  
    }
}
