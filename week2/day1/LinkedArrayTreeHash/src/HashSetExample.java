import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<Integer> intSet = new HashSet<>();

        Integer myInt = new Integer(10);
        intSet.add(myInt);

        // 2. Instantiate and add
        intSet.add(new Integer(5));

        // 3. Instantiate with auto-boxing and add
        Integer anotherInt = 7;
        intSet.add(anotherInt);

        // 4. Autoboxing + add
        intSet.add(9);
        intSet.add(1);
        intSet.add(10);
        intSet.add(15);

        //Retrieve elements of an ArrayList

        //1. Generic - application for all collection - Just printing not accesssing each of the elements
        System.out.println("Using toString()");
        System.out.println(intSet.toString()+"\n");

        //2. Positional Access - Only Applicable for List implementations
        //   for (int i = 0; i < intSet.size(); i++){
        //      System.out.println("Element at the position "+i+ " is "+intSet.get(i));
        //   }

        //3. Using Iterator - applicable for all Collection implementations
        System.out.println("Using Iterator");
        Iterator<Integer> intIterator = intSet.iterator();
        while (intIterator.hasNext()){
            int element = intIterator.next(); // Auto-boxing;
            System.out.println(element);
        }
    }
}