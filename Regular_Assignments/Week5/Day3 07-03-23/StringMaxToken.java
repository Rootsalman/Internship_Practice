import java.util.StringTokenizer;
class StringMaxToken{
  public static void main(String args[]){
    StringTokenizer s = new StringTokenizer("Welcome to bitlabs"); 
    int maxLength=0;
    while(s.hasMoreTokens()){
    System.out.println(s.nextToken().length());
    }
    if(.length()>maxLength){
      System.out.println("The maximun length is" +maxLength);
    }
  }
}
  