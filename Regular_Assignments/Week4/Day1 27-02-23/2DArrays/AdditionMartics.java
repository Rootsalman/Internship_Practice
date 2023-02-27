// import java.util.Scanner;
// class AdditionMartics{
//   public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);
//     int i,j;
//     System.out.println("enter the rows");
//     int n = sc.nextInt();
//      System.out.println("enter the rows");
//     int m = sc.nextInt();
//      int a[][] = new int[n][m];
//     int c[][]=new int[n][m];
//     System.out.println("enter the array elements");
//     for( i=0;i<n;i++){
//       for( j=0;j<m;j++){
//        a[i][j] = sc.nextInt();
//       }
//     } 

//      System.out.println("enter 2nd matrics the rows");
//     int o = sc.nextInt();
//      System.out.println("enter 2nd matrics the rows");
//     int p = sc.nextInt();
//      int b[][] = new int[n][m];

//     System.out.println("enter the array elements");
//     for( i=0;i<n;i++){
//       for( j=0;j<m;j++){
//        b[i][j] = sc.nextInt();
//       }
//     } 
//     System.out.println("The array elements are :");
//      for(i=0;i<n;i++){
//       for(j=0;j<m;j++){
//         c[][]=a[i][j]+b[i][j];
//       } 
//      }
//   }
// }

public class AdditionMartics{  
public static void main(String args[]){  
//creating two matrices    
int a[][]={{1,3,4},{2,4,3},{3,4,5}};    
int b[][]={{1,3,4},{2,4,3},{1,2,4}};    
    
//creating another matrix to store the sum of two matrices    
int c[][]=new int[3][3];  //3 rows and 3 columns  
    
//adding and printing addition of 2 matrices    
for(int i=0;i<3;i++){    
for(int j=0;j<3;j++){    
c[i][j]=a[i][j]+b[i][j];    //use - for subtraction  
System.out.print(c[i][j]+" ");    
}    
System.out.println();//new line    
}    
}} 