import java.util.Scanner;
class ArrayMinNo{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int arr[]=new int[5];
    System.out.println("Enter the array element :");
    for(int i=0;i<5;i++){
       arr[i] = sc.nextInt();
      int min=arr[0];
    }
    System.out.println("array element are :");
    for(int i=0;i<5;i++){
         if(arr[i]<min)
        min=arr[i];
    }
    System.out.println("Maximun number is :" +min);
  }
}