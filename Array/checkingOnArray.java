
import java.util.Arrays;

public class checkingOnArray {
    public static void main(String[] args) {

        // int[] newArr= new int[10];
        // System.out.println(Arrays.toString(newArr));

        // Arrays.fill(newArr, 10);
        // System.out.println(Arrays.toString(newArr));

        int[] firstArray= RandomJava.randomNumber(10);
        // System.out.println(Arrays.toString(firstArray));

        int[] secondArray= Arrays.copyOf(firstArray, 10);
        Arrays.sort(secondArray);

        System.out.println(Arrays.toString(secondArray));
        System.out.println(Arrays.toString(firstArray));

        int[] thirdArray= Arrays.copyOf(firstArray, 5);
        System.out.println(Arrays.toString(thirdArray));

}
}

