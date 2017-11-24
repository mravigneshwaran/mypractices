
package sortingalgorithms;
public class Trycatch {
    public static void main(String[] args) {
        try{
        int[] callArray = {1,2,3};
        System.out.println(callArray[3]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
            
        }
        System.out.println("Hello am not crashed");
                
    }
}
