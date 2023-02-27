// Input Format:
// First line of the input is an integer N that gives the number of rows and columns of the grid.
// Next N lines will have a valid initial board configuration with N*N cells. Assume that the maximum number in a cell can be 10. Grey colored cells are represented by the integer 20 in the matrix representation of the input configuration.
 
// Output Format:
// Output should display an integer that gives the count of numbered cells, given a valid initial board configuration.
// Refer sample input and output for formatting specifications.
 
// Sample Input 1:
// 5
// 20 20 1 20 3
// 20 20 20 20 20
// 20 20 20 20 20
// 20 20 20 20 20
// 6 20 3 20 20
 
// Sample Output 1:
// 4
 
// Sample Input 2:
// 9
// 20 5 20 20 3 20 20 20 20
// 20 20 8 20 20 20 20 5 20
// 20 20 20 20 20 20 2 20 20
// 20 20 20 20 20 20 20 20 20
// 20 20 20 20 20 20 20 20 20
// 20 20 20 20 20 20 20 20 20
// 20 20 3 20 20 20 20 20 20
// 20 3 20 20 20 20 3 20 20
// 20 20 20 20 1 20 20 6 20
 
// Sample Output 2:
// 10
import java.util.Scanner;
class Task{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int i,j,count=0;
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
         if(a[i][j]==20||a[i][j]<10){
          if(a[i][j]<10)
     count++;
           // break;
         }
     }
  }
    // if(count==0)
    //  System.out.println("no");
    // else{
    //   System.out.println("yes");
    // }
    System.out.println(count);
  }
}