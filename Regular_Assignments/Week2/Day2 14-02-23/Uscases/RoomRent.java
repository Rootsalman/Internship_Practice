import java.util.Scanner;
class RoomRent{
     public static void main(String args[]){
       Scanner sc =new Scanner(System.in);
       System.out.println("Enter the cost of room per night");
        int RoomCost=sc.nextInt();
       System.out.println("Enter the number of nights");
        int No_nights = sc.nextInt();
        int Totalcost = RoomCost * No_nights;
       System.out.println("The total cost of the room is :" +Totalcost);
         
     }
}