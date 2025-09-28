import java.util.Arrays;
import java.util.Random;

class RandomJava{
public static void main(String[] args){

int[] firstArray= randomNumber(10);
System.out.println(Arrays.toString(firstArray));
Arrays.sort(firstArray);
System.out.println(Arrays.toString(firstArray));

}

public static int[] randomNumber(int size){

Random random= new Random();
int[] arr= new int[size];

for(int i=0; i< size; i++){
    arr[i]= random.nextInt(100); 
}

return arr; 

}

}