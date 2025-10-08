package Curriculum;

import java.util.Arrays;
import java.util.Random;

public class Prim {
    public static void main(String[] args) {
        byte num=127; // -128 to 127
        char letter='A';

        // String words="Japan";
        // String[] arrStrings= words.split("");
        // System.out.println(Arrays.toString(arrStrings));
        
        // String listCountries= "Japan Srilanka Nepal India Pakistan";
        // String[] listedCountries= listCountries.split(" ");
        // System.out.println(Arrays.toString(listedCountries));

        // for(String country: listedCountries){
        //     System.out.println(country);
        // }

        // String messyWord= "Pranishh"; // but i was going to write Pranisa
        // System.out.println(messyWord);

        // String clearWord= messyWord.replaceFirst("h", "a");
        // System.out.println(clearWord);

        // I need to remove is from this and only present Nepalgunj
        // String findIdx= "Nepalgunj is something different";
        // String[] trimmedString= findIdx.split(" ");

        // System.out.println(Arrays.toString(trimmedString));

        // StringBuilder trimmString= new StringBuilder();

        // for(String words: trimmedString){
        //    trimmString.append(words);
        // }

        // System.out.println(trimmString);



        // // String trimmedStr= trimmedString[0].concat(trimmedString[1]);
        // // System.out.println(trimmedStr);
        // // System.out.println(findIdx.indexOf("i"));


        // StringBuilder sb= new StringBuilder();
        // sb.append(trimmString).reverse();

        // System.out.println(sb);
    
        // StringBuilder sb= new StringBuilder();
        // String sentence= "He is a jolly person";

        // String[] joinedText= sentence.split(" ");

        // for(String rev: joinedText){
        //     sb.append(reverseWord(rev));
        //     sb.append(" ");
        // }

        // System.out.println(sb);]

        String sb= "Sandesh";
        String[] seperated= sb.split("");
        System.out.println(Arrays.toString(seperated));


    


        // String messySentence= "He is a curetaker";
   
        // String correctSentence= messySentence.replaceAll("curetaker", "caretaker");

        // System.out.println(correctSentence);

        // for(char ch: words.toCharArray()){
        //     System.out.println(ch);
        // }



        // int[] randInt= generateRandomNum(10);
        // System.out.println(Arrays.toString(randInt));
        
    }

        
   private static String reverseWord(String se){
    
    StringBuilder sbt= new StringBuilder();

    return sbt.append(se).reverse().toString();

   }

    public static int[] generateRandomNum(int size){

        Random random= new Random();
        int[] randomArr= new int[size];

        for(int i=0; i< size; i++){
            randomArr[i]= random.nextInt(100);
        }

        return randomArr;
    }
}
