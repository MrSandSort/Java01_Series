
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class WorkingArrayList {

    public static void main(String[] args) {

        String[] arr = {" Java", "Python", "C++"};

        Arrays.sort(arr, (a,b)-> a.trim().compareTo(b.trim()));

        System.out.println(Arrays.toString(arr));

        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(arr));

        arrayList.add("Go"); 
        System.out.println("ArrayList: " + arrayList);
        
        // arrayList.sort(Comparator.naturalOrder());

        arrayList.sort(Comparator.comparing(e-> e.trim().toLowerCase()));
        
        System.out.println(arrayList);

        ArrayList<Integer> arrList= new ArrayList<>();
        arrList.add(11);
        arrList.add(8);
        arrList.add(6);
        arrList.add(5);
        arrList.add(10);
        arrList.add(4);

        Integer[] newArr= arrList.toArray(new Integer[0]);
        System.out.println(Arrays.toString(newArr));

        Arrays.sort(newArr);

        System.out.println(Arrays.toString(newArr));

        
    }
}
