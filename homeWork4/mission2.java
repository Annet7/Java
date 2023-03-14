package homeWork.homeWork4;

import java.util.LinkedList;

// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.
public class mission2 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("F");
        list.add("G");
       
        System.out.println("Содержимое: " + list);

        list.add(list.size(), list.get(0));
        list.remove(0);
        System.out.println("Содержимое после перемещения элемента в конец очереди: " + list);
        
        
        System.out.println("Первый элемент очереди: " + list.get(0));
        list.remove(0);
        System.out.println("Содержимое после удаления первого элемента из очереди: " + list);

        System.out.println("Первый элемент очереди: " + list.get(0));
        System.out.println("Содержимое после возвращения первого элемента из очереди, не удаляя его: " + list);
    }
}
    
