import java.util.Scanner;
class ArrayPrime{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    double arr[] = new double[5];
    System.out.println("Enter the array element :");
    for(int i=0;i<5;i++){
       arr[i] = sc.nextDouble();
    }
    System.out.println("prime numbers are :");
    for(int i=0;i<5;i++){
      int count=0;
      for(int j=1;j<arr[i];j++){
        if(arr[i]%j==0){
          count++;
        }
      }
      if(count==2)
      System.out.println(arr[i]);
    }
  }
}