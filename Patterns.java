/*
 ****      // To print this star pattern
 ****
 ****
 ****
 */
package patterns;

public class Patterns {

  
    public static void main(String[] args) {
        for(int i = 1; i<=4; i++){ //it prints 4 rows
            for(int j=1; j<=4; j++){ //it prints 4 columns
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        
    }
    
}
