package homeWork.homeWork4;

import java.util.LinkedList;

// Пусть дан LinkedList с несколькими элементами. Реализуйте метод(не void), который вернет “перевернутый” список.
public class mission1 {
    public static void main(String[] args) {
        LinkedList<String> cats = new LinkedList<>();
        cats.add("Barsik");
        cats.add("Murzik");
        cats.add("Ryzhik");
        cats.add("Pushok");
        cats.add("Vaska");
        cats.add("Soymka");
        System.out.println(cats);

        LinkedList<String> invertCats = new LinkedList<>();
        for (int i = cats.size() - 1; i >= 0 ; i--) {
            invertCats.add(cats.get(i));
        }
        System.err.println(invertCats);
    }
}
