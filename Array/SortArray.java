import java.util.Arrays;
import java.util.Random;

public class SortArray {
    public static void main(String[] args) {

     int[] randomNumbers= RandomGen(3);
     System.out.println("Unsorted Array: "+ Arrays.toString(randomNumbers));
     SortedIntegers(randomNumbers);
     System.out.println("Sorted Array: "+ Arrays.toString(randomNumbers));
     int[] desc= DescendSort(randomNumbers);
     System.out.println("Descending Sorted Array: " + Arrays.toString(desc));

    }

    public static int[] RandomGen(int len){
        int[] newInt= new int[len];
        Random random= new Random();

        for(int i=0; i < newInt.length-1; i++){
            newInt[i]= random.nextInt(1000);
        }
        return newInt;
    }

    public static int[] SortedIntegers(int[] arr1){
        Arrays.sort(arr1);
        return arr1;
    }

    public static int[] DescendSort(int[] arr2){

        int[] sortArray= Arrays.copyOf(arr2, arr2.length);
        
        boolean flag=true;

        while(flag){

        flag=false;

        for(int i=0; i<sortArray.length-1; i++){
            if(sortArray[i]< sortArray[i+1]){
                int temp= sortArray[i];
                sortArray[i]= sortArray[i+1];
                sortArray[i+1]= temp;
                flag= true;
            }        
    }
    
}

return sortArray;
}

}
