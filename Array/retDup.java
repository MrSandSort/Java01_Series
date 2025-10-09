

import java.util.HashMap;

public class retDup {
    public static void main(String[] args) {
        String word="Apple";
        retDuplicates(word);

    }

    public static void retDuplicates(String str){

        HashMap<Character, Integer> hp= new HashMap<>();
        StringBuilder duplicates= new StringBuilder();
        StringBuilder nonDuplicates= new StringBuilder();

        for(char ch:str.toCharArray()){
            hp.put(ch, hp.getOrDefault(ch, 0)+1);
        }

        hp.forEach((key, value) ->{
            if(value>1){
                duplicates.append(key);
            }
            else{
                nonDuplicates.append(key);
            }

        });

        System.out.println("Duplicate Items: " + duplicates);
        System.out.println("Non Duplicate Items: " +nonDuplicates);


        
    }
}
