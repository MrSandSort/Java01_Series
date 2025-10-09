package Curriculum;

public class Nested {

    public static void main(String[] args) {
        // int rows=5;

        // for(int i=1; i<= rows; i++ ){
        //     for (int j=1; j <= i; j++){
        //         System.out.print(j+ "");
        //     }
        //     System.out.println("");
        // }
        // int rows= 4;
        // int columns=4;
        // for(int i=1; i<=rows; i++){
        //     for(int j=1; j<= columns; j++ ){
        //         System.out.print("*");
        //     }
        //     System.out.println("");
        // }
        // for(int i=1; i<=6; i+=2){
        //     System.out.println(i);
        // }
        // int rows =5; 
        // for(int i= rows; i>=1; i--){
        //     for (int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println("");
        // }
        // int rows = 5;
        // for(int i=1; i<=rows; i++){
        //     for(int j=i; j< rows; j++){
        //         System.out.print(" ");
        //     }
        //     for(int k=1; k <=(2*i-1); k++){
        //         System.out.print("*");
        //     }
        //     System.out.println("");
        // }
        // int rows= 5;
        // for(int i=rows; i>=1; i--){
        //     for(int j=i; j< rows; j++){
        //         System.out.print(" ");
        //     }
        //     for(int k=1; k<=(2*i-1);k++){
        //         System.out.print("*");
        //     }
        //     System.out.println("");
        // }
        // Hollow square pattern
        // int size=5;
        // for(int i=1; i<=size; i++){
        //     for(int j=1; j<=size;j++){
        //         if(i==1 || i==size || j==size || j==1 ){
        //             System.out.print("*");
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println("");
        // }
        // Hollow star pattern
        // int size=5;
        // for(int i=1; i<=size; i++){
        //     for(int j=i; j<size; j++){
        //         System.out.print(" ");
        //     }
        //     for(int k=1; k<=(2*i-1); k++){
        //         if(k==1 || i==size || k==(2*i-1)){
        //             System.out.print("*");
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println("");
        // }
        // Diamond Star pattern
        // int size=5;
        // for(int i=1; i<=size; i++){
        //     for(int j= i; j<size; j++){
        //         System.out.print(" ");
        //     }
        //     for(int k=1; k<=(2*i)-1; k++){
        //         System.out.print("*");
        //     }
        //     System.out.println("");
        // }
        //     for(int f=size; f>=1; f--){
        //         for(int j= f; j<size; j++){
        //         System.out.print(" ");
        //     }
        //     for(int k=1; k<=(2*f)-1; k++){
        //         System.out.print("*");
        //     }
        //     System.out.println("");
        // }
        int size = 5;
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            for(int j=i; j<size; j++){
                System.out.print("  ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
        
            System.out.println();
            
        }

        //  int rows = 5;

        // // Outer loop for rows
        // for (int i = 1; i <= rows; i++) {
        //     // Left triangle
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("*");
        //     }

        //     // Spaces between two triangles
        //     for (int j = i; j < rows; j++) {
        //         System.out.print("  ");
        //     }

        //     // Right triangle
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("*");
        //     }

        //     System.out.println(); // Move to next line
        // }


    }

}
