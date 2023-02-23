import java.util.Scanner;
class ArrayDemo2{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    double arr[] = new double[5];
    System.out.println("Enter the array element :");
    for(int i=0;i<5;i++){
       arr[i] = sc.nextDouble();
    }
    System.out.println("array element are :");
    for(int i=0;i<5;i++){
      System.out.println("a["+i+"]=" + arr[i]);
    }
  }
}