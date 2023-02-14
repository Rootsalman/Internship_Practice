import java.util.*;
class Methods{
  public static void main(String args[]){
    Scanner sc =new Scanner(System.in);
    System.out.println("enter a interger Number");
    int num1=sc.nextInt();
    System.out.println("enter a Double Number");
    Double num2=sc.nextDouble();
     System.out.println("enter a Boolean value");
    boolean num3=sc.nextBoolean();
     System.out.println("enter a char Number");
    char num4= sc.next().charAt(0);
     System.out.println("Integer: "+num1);
     System.out.println("Double: "+num2);
     System.out.println("Boolean: "+num3);
     System.out.println("Char: "+num4);
  }
}