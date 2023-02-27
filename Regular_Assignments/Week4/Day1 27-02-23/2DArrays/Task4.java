import java.util.Scanner;
class Task4{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int i,j;
    int max=0;
    System.out.println("enter the rows");
    int n = sc.nextInt();
     System.out.println("enter the rows");
    int m = sc.nextInt();
     int a[][] = new int[n][m];
    System.out.println("enter the array elements");
    for( i=0;i<n;i++){
      for( j=0;j<m;j++){
       a[i][j] = sc.nextInt();
      }
    } 
    System.out.println("The array elements are :");
     for(i=0;i<n;i++){
       for(j=0;j<m;j++){
         if(a[i][j]!=20){
        if(a[i][j]>max){
          max = a[i][j];
        }
         }
     }
  }
    System.out.println(max);
  }
}