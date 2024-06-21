package collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class ArrayListTest {

    public static void main(String[] args) {

        // current capacity = 10 - default capacity once list initialized
        // default constructor
        ArrayList<Integer> l1 = new ArrayList<Integer>();
        System.out.println("-----------l1--------------------\n"+l1);

        //CC = 20
        // parameterized constructor - passing initial capacity
        ArrayList<Integer> l2 = new ArrayList<>(20);
        l2.add(10);
        l2.add(15);
        l2.add(30);
        System.out.println("-------------l2--------------------\n" + l2);

        ArrayList<Integer> l3 = new ArrayList<>(l2);
        l3.add(50);
        l3.add(100);
        System.out.println("-------------l3--------------------\n" + l3);

        System.out.println("--------------------methods-------------------------------------");

        ArrayList<Integer> method = new ArrayList<Integer>();
        method.add(100);
        method.add(100);
        method.add(300);
        method.add(300);
        System.out.println(method);

        // add on specific index
        method.add(1,500);
        System.out.println("---------after adding 1th index -------------\n"+method);

        // add all - collection
        method.addAll(l2);
        System.out.println("------after add all from l2 list ------------\n"+method);

        //remove element

        System.out.println("--------------------remove element----------------------------------");
        boolean remove = method.remove((Integer) 500);  // will remove object
        System.out.println("is 500 removed "+remove);
        System.out.println(method);

        method.remove(0);                         // will remove index 0 object
        System.out.println(method);

        method.removeIf(ele-> ele==10);
        System.out.println(method);


        //index

        System.out.println(method.indexOf((int)300));  // first occurrence
        System.out.println(method.lastIndexOf((int)300));  // first occurrence

        // replace value
        method.set(4,20);
        System.out.println(method);

        System.out.println("-------------------------------------------");
        // iterate an ArrayList
        // 1 - iterator     2 - listIterator    3- forEach

        Iterator<Integer> iterator = method.iterator();

        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
        System.out.println();

        for (Integer num : method){
            System.out.print(num+" ");
        }
        System.out.println();

        //------------------sorting---------------
        System.out.println("---------------------------------------------------");
        method.sort(new ComparatorClass());
        System.out.println(method);


    }
}


class ComparatorClass implements Comparator<Integer> {

    @Override
    public int compare(Integer obj1, Integer obj2) {
        return obj1.compareTo(obj2);
    }
}
