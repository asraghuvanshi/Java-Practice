import java.util.ArrayList;
import java.util.Collections;
class ArrayListClass{


    static void reverseArrayList(ArrayList<Integer> list){
        int i = 0 , j = list.size() - 1;
        while(i < j){
        
            Integer temp = Integer.valueOf(list.get(i));
            list.set(i, list.get(j));
            list.set(j, temp);
            j--;
            i++;
        }
        System.out.println("Reserse List is : "+ list);
    }
    public static void main(String args[]){
        
        ArrayList<Integer> list = new ArrayList<>(); 
        // ArrayList list = new ArrayList();
        list.add(1);    
        list.add(2);
        list.add(3);
        list.add(4);

        if (list.contains(Integer.valueOf(4))){
            System.out.println("Element is present");
        }
        else{
            System.out.println("Element not present");
        }

        // list.remove(3);
        // list.set(1 ,12); 
        System.out.println("arraylist "+ list);
        System.out.println("arraylist size "+ list.size());

        reverseArrayList(list);
        Collections.reverse(list);
        // Collections.sort(list);
        System.out.println("arraylist "+ list);
        // Collections.sort(list , Collections.reverseOrder());
        System.out.println("arraylist "+ list);
    }
}
