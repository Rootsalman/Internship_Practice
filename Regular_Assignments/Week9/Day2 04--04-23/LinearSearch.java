import java.util.*;
class LinearSearch{
  public static void main(String args[]){
    int a[]=new int[7];
    Scanner sc=new Scanner(System.in);
    int count=0;int index=-1;
    for(int i=0;i<a.length;i++){
      a[i]=sc.nextInt();
    }
    System.out.println("enter search element");
    int key=sc.nextInt();
    for(int i=0;i<a.length;i++){
      if(a[i]==key){
        index=i;
        count++;
        break;
      }
    }
    if(count==1){
      System.out.println("element found"+index);
    }
    else{
      System.out.println("not found");
    }
  }
}