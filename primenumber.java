
package patterns;

public class primenumber {
    public static void main(String[] args) {
        int num = 11;
        boolean isPrime = true;
        for(int i=2; i<num; i++){
            if(num%i==0){
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.println(num+ " is a prime");
        }else
            System.out.println(num +" is not a prime number ");
    }
}
