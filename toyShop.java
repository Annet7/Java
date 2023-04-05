import java.util.ArrayList;
import java.util.Collections;

public class toyShop {

    public static void main(String[] args) {
        ArrayList<String> toys = new ArrayList<>();
            toys.add("doll");
            toys.add("doll");
            toys.add("ball");
            toys.add("ball");
            toys.add("ball");
            toys.add("ball");
            toys.add("ball");
            toys.add("ball");
            toys.add("train");
            toys.add("train");
            // System.out.println(toys);
    
        ArrayList<String> giveaway = new ArrayList<>();
        int i =0;
            while (i<3) {  
            Collections.shuffle(toys);  
            giveaway.add(toys.get(1));
            toys.remove(toys.get(0));
            // System.out.println(toys);
            
            i++;
            }
        System.out.println(giveaway);
    }
}