package patterns;

public class Reversestring {
    public static void main(String[] args) {
        String word = "hello";
        String reverse = new StringBuffer(word).reverse().toString();
        System.out.println(reverse);
    }
}
