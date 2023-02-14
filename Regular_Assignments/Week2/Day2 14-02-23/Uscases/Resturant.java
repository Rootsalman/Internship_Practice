import java.util.Scanner;
class Resturant{
     public static void main(String args[]){
       Scanner sc =new Scanner(System.in);
       System.out.println("Enter the cost of food");
        int food=sc.nextInt();
       System.out.println("Enter the Tax");
       int tax = sc.nextInt();
           tax = (food*18)/100;
        System.out.println("Enter the Tip");
        int tip = sc.nextInt();
        int totalcost = food+tax+tip;
       System.out.println("The total cost of food is :" +totalcost);
         
     }
}