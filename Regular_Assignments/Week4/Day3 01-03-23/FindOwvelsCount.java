import java.util.*;
class FindOwvelsCount{
 
  static void convert(String str1){
  char arr[]=str1.toCharArray();
    int count=0;
    for(int i=0;i<arr.length;i++){
     if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u'){
       count++;
     }
    }
    System.out.println(count);
   
  }
 
  
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
     String str1;
    System.out.println("enter string1"); 
   str1=sc.nextLine();
    convert(str1);
  }
}