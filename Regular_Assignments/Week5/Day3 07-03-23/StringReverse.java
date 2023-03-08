import java.util.StringTokenizer;
public class StringReverse{     
    public static void main(String[] args) {        
        String s = "messi leonal goat the";         
        StringTokenizer st = new StringTokenizer(s);         
        String reverse = "";          
        while (st.hasMoreTokens()) {
            reverse = st.nextToken() + " " + reverse;
        }        
        System.out.println("Original string is : " + s);
        System.out.println("Reversed string is : " + reverse);
         
    }
 
}