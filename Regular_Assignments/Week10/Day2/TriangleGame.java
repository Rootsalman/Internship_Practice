// The Westland Game Fair is the premier event of its kind for kids interested in some intellectual and cognitive brain games. Exciting games were organized for kids between age group of 8 and 10. One such game was called the "Triangle game", where different number boards in the range 1 to 180 are available. Each kid needs to select three number boards, where the numbers on the boards correspond to the angles of a triangle.
// If the angles selected by a kid forms a triangle, he/she would receive Prize 1. If the angles selected by a kid forms a right triangle, he/she would receive Prize 2. If the angles selected by the kids form an equilateral triangle, he/she would receive Prize 3. If the angles selected by a kid do not form even a triangle, then he/she will not receive any prizes. Write a program for the organizers to fetch the result based on the number boards selected by the kids.
// Input Format:
// There are 3 lines in the input, each of which corresponds to the numbers on the boards that the kids select.
// Output Format:
// Output should display "Prize 1" or "Prize 2" or "Prize 3" or "No Prize" based on the conditions given.

// Refer sample input and output for formatting specifications.
import java.util.*;
public class TriangleGame{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Welcome Triangle game");
    System.out.println("Enter the 3 angle range between 1-180");
    System.out.println("Enter the first angle");
     int ang1 = sc.nextInt();
     System.out.println("Enter the Second angle");
        int ang2 = sc.nextInt();
     System.out.println("Enter the Third angle");
        int ang3 = sc.nextInt();

        if (ang1 + ang2 + ang3 != 180) {
            System.out.println("No Prize");
        } else if (ang1 == ang2 && ang2 == ang3) {
            System.out.println("Prize 3");
        } else if (ang1 == 90 || ang2 == 90 || ang3 == 90) {
            System.out.println("Prize 2");
        } else {
            System.out.println("Prize 1");
        }
    
  }
}