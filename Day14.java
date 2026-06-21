
import java.util.Date;

public class Day14{
    public static void main(String[] args) {
        //ARRAYLIST
        /*ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>(5);
        
        l2.add(16);
        l2.add(14);
        l2.add(15);
        l2.add(13);

        l1.add(6);
        l1.add(4);
        l1.add(5);
        l1.add(3);
        l1.add(0,5);
        l1.addAll(0,l2);
        System.out.println(l1.contains(12));
        System.out.println(l1.indexOf(3));
        l1.clear();
        for(int i=0;i<l1.size();i++){
            System.out.println(l1.get(i));
        }
        */
       //LINKEDLIST
        /*LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();
        
        l2.add(16);
        l2.add(14);
        l2.add(15);
        l2.add(13);

        l1.add(6);
        l1.add(4);
        l1.add(5);
        l1.add(3);
        l1.add(0,5);
        l1.addAll(0,l2);
        System.out.println(l1.contains(12));
        System.out.println(l1.indexOf(3));
       // l1.clear();
        for(int i=0;i<l1.size();i++){
            System.out.println(l1.get(i));
        }
        */
       //ARRAYDEQUE
      /* ArrayDeque<Integer> ad1 =new ArrayDeque<>();
       ad1.add(5);
       ad1.add(56);
       ad1.add(57);
       ad1.addFirst(34);
       System.out.println(ad1.getFirst());
       System.out.println(ad1.getLast());
       */
      //HASHSET
     /* HashSet<Integer> myHashSet = new  HashSet<>(6,0.5f);
      myHashSet.add(5);
      myHashSet.add(6);
      myHashSet.add(7);
      myHashSet.add(8);
      myHashSet.add(9);
      System.out.println(myHashSet);
      */
     // DATE AND TIME
     //System.out.println(System.currentTimeMillis());
     //System.out.println(Long.MAX_VALUE);
     //System.out.println(System.currentTimeMillis());
      Date d = new Date();
      System.out.println(d);
    }
}
