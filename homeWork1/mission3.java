package homeWork.homeWork1;

import java.util.Scanner;

// Реализовать простой калькулятор (+ - / *)
// Ввод числа ->
// Ввод знака ->
// Ввод числа ->
public class mission3 {
    public static void main(String[] args) {
       
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        Float firstNumber = in.nextFloat();
        System.out.print("Что хотите сделать с числами? ");
        String action = in.next();
        System.out.print("Введите второе число: ");
        int secondNumber = in.nextInt();
        in.close();

        switch(action){
             
            case "/": 
                System.out.println(firstNumber / secondNumber);
                break;
            case "*": 
                System.out.println(firstNumber * secondNumber);
                break;
            case "-": 
                System.out.println(firstNumber - secondNumber);
                break;
            default:
                System.out.println(firstNumber + secondNumber);
        }
    }
}
