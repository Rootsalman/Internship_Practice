import java.util.*;
class StringFindOvwelsAtIndex{
  static void Stringcontains(String SubString){
      for(int i=0;i<SubString.length()-1;i++){
        if(SubString.charAt(i)=='a'|| SubString.charAt(i)=='e'||SubString.charAt(i)=='i'||SubString.charAt(i)=='o'||SubString.charAt(i)=='u'){
        System.out.println(SubString.charAt(i));
      }
        
      }
          // System.out.println("subString is not found");
      // System.out.println(SubString.length());
    
}
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your string");
    String SubString = sc.nextLine();
    //  System.out.println("Enter your Sub string string");
    // String SubString = sc.nextLine();
    Stringcontains(SubString);
    
  }
}