import java.util.Scanner;
class ArrayPosNo{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int arr[] = new int[5];
    System.out.println("Enter the array element :");
    for(int i=0;i<5;i++){
       arr[i] = sc.nextInt();
    }
    System.out.println("array element are :");
    for(int i=0;i<5;i++){
      if(arr[i]>0)
      System.out.println("the positive elments are :" +arr[i]);
    }
  }
}