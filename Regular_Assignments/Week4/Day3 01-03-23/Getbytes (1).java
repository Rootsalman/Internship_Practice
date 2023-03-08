import java.util.*;
class Getbytes{
  public static void getbyte(String str){
   byte[] arr=str.getBytes();  
for(int i=0;i<arr.length;i++){  
System.out.println(arr[i]);  
}  
  }
    public static void main(String args[]){
      getbyte("bitlabs");
    }
}