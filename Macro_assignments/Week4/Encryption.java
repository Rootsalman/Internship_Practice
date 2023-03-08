import java.util.Scanner;
class Encryption{
  static void encrypt(String text,int s){
    StringBuffer result= new StringBuffer();
     text=text.replaceAll(" ","");
     text=text.toUpperCase();
   
    for (int i=0; i<text.length(); i++)
        {
          char ch = (char)(((int)text.charAt(i) +  s - 65) % 26 + 65);
          result.append(ch);
        }
        System.out.println(result);
    }
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    String text = sc.nextLine();
    int s = 4;
    System.out.println("Text  : " + text);
    System.out.println("Shift : " + s);
    System.out.print("Cipher:" );
    encrypt(text, s);
    }
}

// import java.util.*;

 

// class EncryptedString {

 

//   public static void main(String[] args) {
//     String s;
//     String s1 = "", s2 = "";
//     Scanner sc = new Scanner(System.in);
//     System.out.println("enter a string");
//     s = sc.next();
//     for (int i = 0; i < s.length(); i++) {
//       if (i % 2 == 0) {
//         s1 = s1 + s.charAt(i);
//       } else {
//         s2 = s2 + s.charAt(i);
//       }
//     }
//     System.out.println("Encrypted String is :" + s1 + s2);
//   }
// }