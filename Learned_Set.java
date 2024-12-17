package Collection_Set_By_AnujBhaiya;

import java.awt.desktop.UserSessionEvent;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Learned_Set {
    public static void main(String[] args) {

        //Aaap Set Interface ke under HashSet class
        //ko jyada Use karte hai Because uski Time Complexity O(1) hoti hai.
        //Bakinyoki Time Complexity O(n) hoti hai to Kam Use hota hai.
        //Not Duplicate Element allowed
        //Oreder is Preserved
//        Set<Integer> set = new HashSet<>(); //O(1)
//        Set<Integer> set = new LinkedHashSet<>();O(n)

        //Return Sorted Treeset
        Set<Integer> set = new TreeSet<>();//O(log n)
        set.add(10);
        set.add(50);
        set.add(90);
        set.add(30);
        set.add(20);

        set.remove(20);
        System.out.println(set.contains(10));
        System.out.println(set);
    }
    //37
}
