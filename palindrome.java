
package patterns;

public class palindrome {
    public static void main(String[] args) {
        int n=125,r,s=0;
        int temp = n;
        while(n>0){
            r = n%10;
            n = n/10;
            s= s*10+r;
        }
        if(temp == s){
            System.out.println("Palindrome");
        }else
            System.out.println("Not a palindrome");
    }
}
