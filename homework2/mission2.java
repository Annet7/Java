package homeWork.homework2;


import java.io.FileReader;
import java.util.Scanner;
// "фамилия":"Иванов","оценка":"5","предмет":"Математика"
// "фамилия":"Петрова","оценка":"4","предмет":"Информатика"

// Написать метод(ы), который распарсит строку и, используя StringBuilder, создаст строки вида:
// Студент [фамилия] получил [оценка] по предмету [предмет].

// Пример вывода:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.
// .

// .
/**
 * mission2
 */
public class mission2 {

    public static void main(String[] args) throws Exception {
 
        FileReader fr= new FileReader("mission2.txt");
        Scanner scan = new Scanner(fr);
            
        int i = 1;
        
        while (scan.hasNextLine()) {
            System.out.println(i + " : " + scan.nextLine());
            i++;
        }
 
        fr.close();
        scan.close();
 
    }
}

//На этом мои полномочия всё.... Не могу разобраться, как мне теперь изменять считанные данные....