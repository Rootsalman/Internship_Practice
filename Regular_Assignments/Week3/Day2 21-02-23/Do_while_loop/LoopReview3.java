import java.util.*;
class LoopReview3{
      public static void main(String[] args) {
      int num = 10;
        int i =1;
        do{
           if(num % i == 0)
             System.out.println("The factors of 10 are :");
          System.out.println(i + " "); 
             i++; 
        } while(i<=num); 
     }
 }
