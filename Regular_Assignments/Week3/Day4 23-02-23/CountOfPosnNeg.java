import java.util.Scanner;
class CountOfPosnNeg{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int arr[] = new int[5];
    int pcount=0,ncount=0,zcount=0;
    System.out.println("Enter the array element :");
    for(int i=0;i<5;i++){
       arr[i] = sc.nextInt();
    }
    System.out.println("array element are :");
    for(int i=0;i<5;i++){
      if(a[i]>0){
        pcount++;
      }
        else if(a[i]==0){
          zcount++;
        }
      else{
        ncount++;
      }
    }
    System.out.println("the count of positive numbers is :" +pcount);
    System.out.println("the count of negative numbers is :" +ncount);
     System.out.println("the count of zeros is :" +zcount);
  }
}