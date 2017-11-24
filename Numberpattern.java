/*
 1 2 3 4                                                                        
 1 2 3 4
 1 2 3 4
 1 2 3 4 

 1 1 1 1       result 2 3 4 5         -1  result 1 2 3 4
 2 2 2 2              3 4 5 6
 3 3 3 3              4 5 6 7  
 4 4 4 4              5 6 7 8  
 */
package patterns;

public class Numberpattern {
    public static void main(String[] args) {
        for(int i=1; i<=4; i++){
            for(int j=1; j<=4; j++){
                System.out.print(i+j-1+ " "); //i->prints rows j->prints columns i+j->both rows and columns
            }
            System.out.println("");
        }
    }
}
