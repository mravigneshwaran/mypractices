/*
 printing odd or even number
 */
package patterns;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = s.nextInt();
        int j = s.nextInt();
        
        for(int i=0; i<20; i++){
        if(n%i==0){
            System.out.println("Even number" );
        }else{
            System.out.println("Odd number");
        }
        }
        
        
        
    }
}
