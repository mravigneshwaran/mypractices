
package patterns;

public class Reversestring1 {
    public static void main(String[] args) {
        //my name is vikki
        //vikki is name name my
        String str = "my name is vikki";
        String a[] = str.split(" ");
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]+ " ");
        }
        System.out.println(" ");
        for(int i=a.length-1; i>=0; i--){
            System.out.print(a[i] +" ");
    }
        System.out.println("");
    }
}
