// Input Format:
// First line of the input is an integer N that gives the number of rows and columns of the grid.
// Next N lines will have a valid initial board configuration with N*N cells. Assume that the maximum number in a cell can be 10. Grey colored cells are represented by the integer 20 in the matrix representation of the input configuration.
 
// Output Format:
// Output should display an integer that the number of white cells in the final configuration of the board.
// Refer sample input and output for formatting specifications.
 
// Sample Input 1:
// 5
// 20 20 1 20 3
// 20 20 20 20 20
// 20 20 20 20 20
// 20 20 20 20 20
// 6 20 3 20 20
 
// Sample Output 1:
// 13
 
// Sample Input 2:
// 5
// 20 20 20 20 20
// 3 20 20 6 20
// 20 20 20 20 20
// 20 2 20 20 1
// 20 20 20 20 20
 
// Sample Output 2:
// 12
import java.util.Scanner;
class Task3{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int i,j,sum=0;
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
          sum = sum + a[i][j];
         }
     }
  }
    System.out.println(sum);
  }
}