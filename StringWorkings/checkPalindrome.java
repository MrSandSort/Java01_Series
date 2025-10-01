package StringWorkings;

public class checkPalindrome {
    public static void main(String[] args){

        boolean checkPalindrome= isPalindrome("SantaS");
        System.out.println("Given number is palindrome: "+ checkPalindrome);
    }

    public static boolean isPalindrome(String s){
        int left=0, right=s.length()-1;

        while(left < right){
            if(s.charAt(right)!= s.charAt(left)){
                return false;
            }
            
            left++;
            right--;
            
        }
 
        return true;
    }
}
 