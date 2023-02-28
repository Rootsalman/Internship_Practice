import java.util.Scanner;
class ReadNdisplay{
  
  static void read(int size,int arr[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter array elements");
    for(int i=0;i<size;i++){
      arr[i]=sc.nextInt(); 
    }
  }
  
  static void display(int n,int arr[]){
    System.out.println("*elements*");
    for(int i=0;i<n;i++){
      System.out.println(arr[i]);
    }
  }
  
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the size");
    int n=sc.nextInt();
    int a[]=new int[n];
    read(n,a);
    display(n,a);
  }
}