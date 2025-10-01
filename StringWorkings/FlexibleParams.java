
package StringWorkings;

import java.util.Arrays;

public class FlexibleParams {
    public static void main(String... args) {
        System.out.println("Hello World Again");
        String[] splitStrings= "Hello World Again".split(" ");
        System.out.println(Arrays.toString(splitStrings));
        printText(splitStrings);
    }

    public static void printText(String[] textList){

        for(String t: textList){
            System.out.println(t);
        }

    }


}
