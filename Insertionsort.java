
package sortingalgorithms;
public class Insertionsort{
    
    public static int[] Insert(int[] input){
        int temp;
        for(int i = 1; i < input.length; i++){
            for(int j=i; j > 0; j--){
                if(input[j] < input[j-1]){
                temp = input[j];
                input[j] = input[j-1];
                input[j-1] = temp;
                }
            }
            
        }
        return input;
    }
    
    
    public static void main(String[] args) {
        int[] myArray = {34,12,10,15,20};
        int[] sorted = Insert(myArray);
        for(int i=0; i < sorted.length; i++){
            System.out.print(sorted[i]);
            System.out.print(",");
        }
    }

}