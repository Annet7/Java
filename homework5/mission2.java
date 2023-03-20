package homeWork.homework5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

// Пусть дан список сотрудников:
// Иван Иванов
// Светлана Петрова
// Кристина Белова
// Анна Мусина
// Анна Крутова
// Иван Юрин
// Петр Лыков
// Павел Чернов
// Петр Чернышов
// Мария Федорова
// Марина Светлова
// Мария Савина
// Мария Рыкова
// Марина Лугова
// Анна Владимирова
// Иван Мечников
// Петр Петин
// Иван Ежов

// Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
// Отсортировать по убыванию популярности Имени.

public class mission2 {
    public static void main(String[] args) {
        Map<String, String> people = new HashMap<>();
        people.put("Иванов", "Иван");
        people.put("Петрова", "Светлана");
        people.put("Белова", "Кристина");
        people.put("Мусина", "Анна");
        people.put("Крутова", "Анна");
        people.put("Юрин", "Иван");
        people.put("Лыков", "Петр");
        people.put("Чернов", "Павел");
        people.put("Чернышов", "Петр");
        people.put("Федорова", "Мария");
        people.put("Светлова", "Марина");
        people.put("Савина", "Мария");
        people.put("Рыкова", "Мария");
        people.put("Лугова", "Марина");
        people.put("Владимирова", "Анна");
        people.put("Мечников", "Иван");
        people.put("Петин", "Петр");
        people.put("Ежов", "Иван");
    
        
        // String name = people.get(people);
        ArrayList<String> name = new ArrayList<>(people.values());
        name.sort(Comparator.naturalOrder());
        System.out.println(name);
        int count = 0;
        String repeat = name.get(0);
        for (int i = 0; i < name.size(); i++) {
            if (name.get(i).equals(repeat)) {
                count++;
            } else {
                System.out.println(repeat + " " + count);
                count = 1;
                repeat = name.get(i);
            }
        }
        System.out.println(name.get(name.size()-1)+" "+count);
    }
}
