package homeWork.homeWork4;
// В калькулятор добавьте возможность отменить последнюю операцию.
// Пример

import java.util.ArrayList;
import java.util.Scanner;

// 1
// +
// 2
// ответ:
// 3

// +
// 4
// ответ:
// 7

// Отмена
// 3
// *
// 3

// ответ:
// 9
// Дополнительно каскадная отмена - отмена нескольких операций



//Пожалуйста, Никита, помогите спасти мой калькулятор. В результате программы зацикливаются значения 
//результата первого действия и само действие постоянно повторяется. плюс проблема с переприсваеванием 
//значения переменной с первым числом, для последующей каскадной отмены.
public class mission3 {
    public static void main(String[] args) {
       
        Scanner in = new Scanner(System.in);
        ArrayList<Double> result = new ArrayList<>(); //создаю коллекцию типа дабл

        double division; //создаю переменный, для записывания результатов ариф.операций
        double mult;
        double minus;
        double sum;
        
        System.out.print("Введите первое число: "); //приглашаю пользователя ввести 1-е число
        double firstNumber = in.nextFloat(); //записываю первое число в переменную
        System.out.print("Что хотите сделать с числами? ");//приглашаю пользователя ввести действие
        String action = in.next();//записываю действие в переменную
        System.out.print("Введите второе число: ");//приглашаю пользователя ввести 2-е число
        int secondNumber = in.nextInt();//записываю второе число в переменную
        
        while(true){//пока цикл истенный, делай...
            String n = in.nextLine(); //создаю строку для сканера
            if (n.equals("stop")){//если в этой строке значение стоп, выхожу из цикла
                break;
            }
            else{//иначе
                    switch(action){//проверяю значение переменной с действием
                        case "/": // если деление
                            division = firstNumber / secondNumber; //присваиваю результат деления в соответствующую переменную
                            result.add(division);//записываю эту переменную в массив с результатами
                            System.out.println(division);//вывожу результат пользователю, чтобы он не скучал
                            break;//останавливаю кейс
                        case "*": //для остальных значений действий всё по аналогии с делением
                            mult = firstNumber * secondNumber;
                            result.add(mult);
                            System.out.println(mult);
                            break;
                        case "-": 
                            minus = firstNumber - secondNumber;
                            result.add(minus);
                            System.out.println(minus);
                            break;
                        case "+":
                            sum = firstNumber + secondNumber;
                            System.out.println(sum);
                            result.add(sum);
                            break;
    //Вот где-то здесь я хочу поменять значение переменной с первым число на последнее значение
    //массива с результатами, но не знаю как это сделать,
    //ибо мой вариант: firstNumber = result.get(result.size() - 1);
    //какого-то лешиго совсем не хочет работать.
                    }
                if (n.equals("err")){//проверяю, если строка равна err, 
                    result.remove(result.get(result.size() - 1));//то удаляю последний эллемент массива с результатами
                }   

            }
        }
        

    }
    
}
