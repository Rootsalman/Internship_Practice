// Write a Java program to create a new array list, add some colors (string) and print out the collection
import java.util.*;
class Colors{
  public static void main(String args[]){
List<String> fruits=new ArrayList<String>();
    fruits.add("Orange");
    fruits.add("apple");
    fruits.add("Mango");
    int count=0,index=0;
    for(String str:fruits){
    if(str.equals("apple")){
      count++;
     index=fruits.indexOf("apple");
      break; 
    }
    }
      if(count==1){
        System.out.println("found at position "+index);
      }
      else
      {
        System.out.println("not found");
      }
     System.out.println(fruits);
  }
  
}