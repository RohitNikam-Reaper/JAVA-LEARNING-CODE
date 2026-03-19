import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class _56_array_list {
    public static void main(String[] args) {

        // ARRAYLIST:- a resizable array that stores objects (autoboxing)
        // array are fixed in size, but array list can change

        // add is used to add an element in a array
        // remove is used to remove an element in a array

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list);

        ArrayList<Double> list1 = new ArrayList<>();

        list1.add(1.34);
        list1.add(2.66);
        list1.add(3.67);

        System.out.println(list1);

        ArrayList<String> list2 = new ArrayList<>();

        list2.add("Apple");
        list2.add("Orange");
        list2.add("Banana");
        list2.add("Coconut");
        list2.add("Guava");
        System.out.println(list2);

        System.out.println("removing an element banana");

        list2.remove(2);
        System.out.println(list2);

        System.out.println("using set method i can set at particular index what it can be :- 0th index grapes");
        list2.set(0,"Grapes");

        System.out.println(list2);

        System.out.println("from get method i can get the value of the particular index no:- ");

        System.out.println(list2.get(1));

        System.out.println("i can also get the size of the array");

        System.out.println(list2.size());

        System.out.println("soring an array using Collection method");
        Collections.sort(list2);
        System.out.println(list2);

        System.out.println("enchanced for loop");
        for (String fruits: list2){
            System.out.println(fruits);
        }




    }
}
