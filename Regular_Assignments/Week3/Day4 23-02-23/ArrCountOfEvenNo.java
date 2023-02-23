import java.util.Scanner;
class ArrCountOfEvenNo{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    double arr[] = new double[5];
    int evencount=0;
    System.out.println("Enter the array element :");
    for(int i=0;i<5;i++){
       arr[i] = sc.nextDouble();
    }
    System.out.println("array element are :");
    for(int i=0;i<5;i++){
      if(arr[i]%2==0){
        evencount++; 
      }
    }
    System.out.println("the count of even numbers is :" +evencount);
  }
}