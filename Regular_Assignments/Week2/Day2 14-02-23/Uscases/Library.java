import java.util.Scanner;
class Library{
     public static void main(String args[]){
       Scanner sc =new Scanner(System.in);
       System.out.println("Enter book name");
        String bn =sc.next();
        System.out.println("Enter Author name");
        String an =sc.next();
       System.out.println("Enter book_Id");
        int bi = sc.nextInt();
        System.out.println("Enter member name");
        String mn = sc.next();
        System.out.println("Enter member_Id");
        int mi = sc.nextInt();
       System.out.println("The book name is :" +bn);
        System.out.println("The Author name is :" +an);
        System.out.println("The Book_id is :" +bi);
        System.out.println("The member name is :" +mn);
       System.out.println("The member_Id is :" +mi);
         
     }
}