import java.util.Scanner;
class ArrayDeclaration{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a[][] = new int[3][2];
    System.out.println("enter the array elements");
    int count = 0;
    for(int i=0;i<3;i++){
      for(int j=0;j<2;j++){
        a[i][j] = sc.nextInt();
      }
    } 
    System.out.println("The array elements are :");
     for(int i=0;i<3;i++){
       for(int j=0;j<2;j++){
         if(a[i][j]==2){
            count++;
         }
     }
  }
     System.out.println(count);
  }
}