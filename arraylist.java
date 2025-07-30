import java.util.ArrayList;
import java.util.Iterator;
public class Arraylist {

    public static void main(String[] args) {
        // Example usage of the ArrayList class
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(7);
        list.add(20);
        System.out.println("list: " + list);
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.add(21);
        list2.add(11);
        list2.add(30);
        System.out.println("list2: " + list2);
        ArrayList<Integer> mergeList = new ArrayList<Integer>();
        mergeList.addAll(list);
        mergeList.addAll(list2);
        mergeList.sort(null);
        System.out.println("merged list: " + mergeList);
        System.out.println("list size: " + list.size());

        System.out.println("Print Before 20 elements");
        Iterator<Integer> iterator = mergeList.iterator();
        while (iterator.hasNext()) {
            Integer element = iterator.next();
            if (element <= 20) {
                System.out.println(element);
            }
        }

        System.out.println("print After 20 elements"); 
        Iterator<Integer> iterator2 = mergeList.iterator();
        while (iterator2.hasNext()) {
            Integer element = iterator2.next();
            if (element > 20) {
                System.out.println(element);
            }
        }

       }
}