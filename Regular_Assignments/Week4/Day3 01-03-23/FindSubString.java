import java.util.*;
class FindSubString{
  static void Stringcontains(String str1){
    if(str1.startsWith("S") && str1.endsWith(".com")){
      System.out.println("valid");
    }
    else{
      System.out.println("not valid");
    }
  }
    //1.to find @ in sub string
  //   if(str1.contains(SubString)){
  //     if(SubString.contains("@")){
  //       System.out.println("character found at the index" +SubString.indexOf("@"));
  //     }
  //     else{
  //       System.out.println("not found");
  //     }
  //   }
  // }
    //to find ovwels in character
  //     for(int i=0;i<SubString.length()-1;i++){
  //       if(SubString.charAt(i)=='a'|| SubString.charAt(i)=='e'||SubString.charAt(i)=='i'||SubString.charAt(i)=='o'||SubString.charAt(i)=='u'){
  //       System.out.println(SubString.charAt(i));
  //     }
  //     }
  //     // System.out.println(SubString.length());
  //   }else{
  //         System.out.println("subString is not found");
  //   }
  // }
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    // int count=0;
    System.out.println("Enter your first string");
    String str1 = sc.nextLine();
    // System.out.println("Enter your second string");
    // String SubString = sc.nextLine();
    Stringcontains(str1);
    
  }
}