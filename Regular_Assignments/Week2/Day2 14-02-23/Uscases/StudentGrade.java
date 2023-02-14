import java.util.Scanner;
class StudentGrade{
     public static void main(String args[]){
       Scanner sc =new Scanner(System.in);
       System.out.println("Enter Sub1 marks");
        int sub1=sc.nextInt();
       System.out.println("Enter the Sub2 marks");
        int sub2 = sc.nextInt();
        System.out.println("Enter the Sub3 marks");
        int sub3 = sc.nextInt();
        int AvgMarks = (sub1+sub2+sub3)/3;
       System.out.println("The Average marks of the student is is :" +AvgMarks);
         
     }
}