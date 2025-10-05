import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class RandomJava{
public static void main(String[] args){

int[] firstArray= randomNumber();
System.out.println(Arrays.toString(firstArray));
Arrays.sort(firstArray);
System.out.println(Arrays.toString(firstArray));

}

public static int[] randomNumber(){

Random random= new Random();
int size;
    try (Scanner input = new Scanner(System.in)) {
        size = input.nextInt();
    }
int[] arr= new int[size];

for(int i=0; i< size; i++){
    arr[i]= random.nextInt(100); 
}

return arr; 

}

}