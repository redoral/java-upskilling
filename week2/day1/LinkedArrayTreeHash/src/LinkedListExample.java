import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<Integer> intList = new LinkedList<>();

        //Storing elements into a LinkedList

        // 1. Instantiate and add
        Integer myInt = new Integer(10);
        intList.add(myInt);

        // 2. Instantiate and add
        intList.add(new Integer(5));

        // 3. Instantiate with auto-boxing and add
        Integer anotherInt = 7;
        intList.add(anotherInt);

        // 4. Autoboxing + add
        intList.add(9);
        intList.add(1);
        intList.add(10);
        intList.add(15);

        //Retrieve elements of a LinkedList

        //1. Generic - application for all collection - Just printing not accesssing each of the elements
        System.out.println("Using toString()");
        System.out.println(intList.toString()+"\n");

        //2. Positional Access - Only Applicable for List implementations
        for (int i = 0; i < intList.size(); i++){
            System.out.println("Element at the position "+i+ " is "+intList.get(i));
        }
        System.out.println();

        System.out.println("adding 100 at first");
        intList.addFirst(100);

        System.out.println("adding 99 at last");
        intList.addLast(99);

        //3. Using Iterator - applicable for all Collection implementations
        System.out.println("Using Iterator");
        Iterator<Integer> intIterator = intList.iterator();
        while (intIterator.hasNext()){
            int element = intIterator.next(); // Auto-boxing;
            System.out.println(element);
        }


    }
}