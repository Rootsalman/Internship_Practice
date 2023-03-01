import java.util.*;
class StringAlphaDigitSpecialCharacter{
  static void characterCount(String str){
    char ch[]=str.toCharArray();
    int alphacount=0,digitcount=0,specialcount=0;
    for(int i=0;i<ch.length;i++){
      if((ch[i]>='a'&&ch[i]<='z')||(ch[i]>='A'&&ch[i]<='Z'))
      {
        alphacount++;
      }
      else if(ch[i]>='0'&&ch[i]<='9'){
        digitcount++;
      }
      else{
        specialcount++;
      }
  
    }
    System.out.println("alphabets are "+ alphacount);
    System.out.println("digits are "+digitcount);
    System.out.println("Special characters are: "+specialcount);
  }
 
  
  
  public static void main(String args[]){
  //   Scanner sc=new Scanner(System.in);
  //   String str1,subString;
  //   System.out.println("enter string1"); 
  //  str1=sc.nextLine();
  //   System.out.println("enter string2"); 
  // subString=sc.nextLine();
    characterCount("messi@gmail#123");
    
   
    
  }
}