
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


// creating an array from arraylist


public class ArrayListings {
    
    public static void main(String[] args){

        ArrayList<String> districStrings= new ArrayList<>(List.of("Kathmandu","Pokhara","Bardiya","Banke","Bhaktapur"));
        String[] arrayStrings= districStrings.toArray(new String[0]);

        System.out.println(Arrays.toString(arrayStrings));

        byte num= 12;
        System.out.println(num);

    }
}
