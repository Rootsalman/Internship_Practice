import java.util.Scanner;
class TrafficLight{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
     int Time;
     String Traffic_Flow;
    System.out.println("Enter the time");
    Time = sc.nextInt();
    System.out.println("Enter the traffic condition");
    System.out.println("1 for heavy traffic");
    System.out.println("2 for Light traffic");
    Traffic_Flow = sc.next();
    if(Traffic_Flow.equals("1") && Time>=9 && Time<=11){
      System.out.println("Red light for east west green light for north south");
    }
    else if(Traffic_Flow.equals("1") && Time>=11 && Time<=12){
      System.out.println("Red light for north and south green light for East and West");
    }
    else if(Traffic_Flow.equals("2") && Time>=22 && Time>=6){
       System.out.println("Yellow light Zero Traffic");
    }
  }
}