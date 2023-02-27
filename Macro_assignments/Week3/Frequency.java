import java.util.*;
class Frequency{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter size of array");
    int n=sc.nextInt();
    System.out.println("enter elemnts in array");
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    
    int frequency[]=new int[arr.length];
    int visited=-1;
    for( int i=0;i<arr.length;i++){
      int count=1;
      for(int j=i+1;j<arr.length;j++){
        if(arr[i]==arr[j]){
          count++;
          frequency[j]=visited;
        }
      }
      if(frequency[i]!=visited){
        frequency[i]=count;
      }
    }
    //Displays the frequency of each element present in array  
    System.out.println("---------------------------------------");  
    System.out.println(" Element | Frequency");  
    System.out.println("---------------------------------------");  
    for(int i=0;i<frequency.length;i++){  
      if(frequency[i] != visited)  
        System.out.println("    " + arr[i] + "    |    " + frequency[i]);  
    }  
    System.out.println("----------------------------------------");  
  }
}