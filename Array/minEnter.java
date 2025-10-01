
import java.util.Arrays;
import java.util.Scanner;

public class minEnter {
    public static void main(String[] args){
        int[] getIntegers= readIntegers();
        System.out.println(Arrays.toString(getIntegers));
        int getMinimum= getMinimum(getIntegers);
        System.out.println("MIN: " + getMinimum);
    }

    public static int[] readIntegers(){

        String input;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a list of integers, seperated by commas");
            input = scanner.nextLine();
        }

        String[] splits= input.split(",");
        int[] values= new int[splits.length];

        for(int i=0; i< values.length;i++){
            values[i]= Integer.parseInt(splits[i].trim());
        }

        return values;

    }

    public static int getMinimum(int[] arr){

        int min= Integer.MAX_VALUE;
        
        for (int e: arr) {
         if(e<min){
            min= e;
         }
        }

        return min;
    }
}
