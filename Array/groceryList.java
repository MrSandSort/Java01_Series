
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class groceryList {
    public static void main(String[] args) {
        String[] items= new String[]{"pickles","rice","dal","masu"};
        List<String> listArr= List.of(items);
        System.out.println(listArr);

        ArrayList<String> ItemsList= new ArrayList<>(listArr);
        ItemsList.add("yogurts");
        System.out.println(ItemsList);

        ItemsList.add("pickles");
        System.out.println(ItemsList);

        // System.out.println(ItemsList.indexOf("pickles"));
        // System.out.println(ItemsList.lastIndexOf("pickles"));

        // ItemsList.remove("pickles"); // removed only the first pickles
        // System.out.println(ItemsList);

        ItemsList.removeAll(List.of("pickles"));
        System.out.println(ItemsList);

        ItemsList.addAll(0, List.of("apples","mangos","dragon-fruit"));
        System.out.println(ItemsList);
        
        System.out.println(ItemsList.get(0));

        // ItemsList.clear();
        // System.out.println("Is this grocery list empty? "+ ItemsList.isEmpty());

         ItemsList.sort(Comparator.naturalOrder());

         System.out.println(ItemsList);

         ItemsList.sort(Comparator.reverseOrder());
         
         System.out.println(ItemsList);


        // System.out.println(ItemsList.get(0));
        // ItemsList.set(0,"mo:mo");

        // System.out.println(ItemsList);

    }
}
