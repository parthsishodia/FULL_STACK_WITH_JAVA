import java.util.*;
public class arrayList1 {
    public static void main(String args[])
    {
        ArrayList<Integer> list= new ArrayList<Integer>();

        //add elements
        list.add(0);
        list.add(2);
        list.add(3);

        System.out.println(list);

        //get operation
        int ele = list.get(2);
        System.out.println(ele);


        //add element in btw
        list.add(1,2);
        System.out.println(list);


        //set element
        list.set(0,1);
        System.out.println(list);

        //delete element
        list.remove(3);
        System.out.println(list);

        //count number of element
        int size=list.size();
        System.out.println(size);

        //loops
        for(int i=0;i<size;i++)
        {
            System.out.println(list.get(i));
        }

        //iterating using for each loop
        for(Integer fruit:list)
        {
            System.out.println("for each");
            System.out.println(fruit);
        }

        //List iterator
        ListIterator<Integer> iterator=list.listIterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }


        //sorting

        Collections.sort(list);
        System.out.println(list);
    }
}
