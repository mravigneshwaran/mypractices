package sortingalgorithms;
import java.net.URL;
import java.net.MalformedURLException;
public class Malformed {
    public static void main(String[] args) {
        
        try{
            URL url = new URL("httpss://google.com");
            System.out.println("URL Protocol is " + url.getProtocol());
        }
        catch(MalformedURLException e){
            System.out.println("Correct the protocol" + e);
        }
        
    }
}
