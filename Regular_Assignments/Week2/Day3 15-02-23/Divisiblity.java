import java.util.*;
class Divisiblity{
  public static void main(String args[]){
    int Num;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number");
    Num=sc.nextInt();
    if((Num%5==0)&&(Num%11==0)){
      System.out.println("The number is divisible by 5 and 11");
    }
    else{
      System.out.println("the number is not divisible by 5 and 11");
    }
   
  }
}