package homeWork.homework5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
// Добавить функции 1) Добавление номера  2) Вывод всего
// Пример:
// Я ввожу: 1
// К: Введите фамилию
// Я: Иванов
// К: Введите номер
// Я: 1242353
// К: Введите 1) Добавление номера
// 2) Вывод всего
// Я ввожу: 1
// К: Введите фамилию
// Я: Иванов
// К: Введите номер
// Я: 547568
// К: Введите 1) Добавление номера
// 2) Вывод всего
// Я: 2
// Иванов: 1242353, 547568

public class mission1 {
    public static void main(String[] args) {

        Map<String, String> phoneBook = new HashMap<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Введите 1) Добавление номера\n 2) Вывод всего\n 3) Закрыть справочник ");
        int action = input.nextInt();
            
        while(action != 3){
            if (action == 1){
                    
                    System.out.println("Введите фамилию: ");
                    String surName = input.next();
                    System.out.println("Введите номер: ");
                    String number = input.next();
                    phoneBook.put(number, surName); 
                    System.out.println("Введите 1) Добавление номера\n 2) Вывод всего\n 3) Закрыть справочник ");
                    action = input.nextInt();
            }
            else{
                    System.out.println(phoneBook); 
                    System.out.println("Введите 1) Добавление номера\n 2) Вывод всего\n 3) Закрыть справочник ");
                    action = input.nextInt();
            }    
        }
        System.out.println("Конец программы");
        input.close();
    }
}  



