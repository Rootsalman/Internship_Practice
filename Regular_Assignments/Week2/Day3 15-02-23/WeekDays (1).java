import java.util.*;
class WeekDays{
  public static void main(String args[]){
    int Num;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the week number");
    Num = sc.nextInt();		
    if(Num>7){
      System.out.println("Enter 1 to 7...");
    }
		else if(Num==1){
			System.out.println("This is a Sunday");
    }
		else if(Num==2){
			System.out.println("This is a Monday");
    }
		else if(Num==3){
			System.out.println("This is a Tuesday");
    }
		else if(Num==4){
			System.out.println("This is a Wednesday");
    }
		else if(Num==5){
			System.out.println("This is a Thursday");
    }
		else if(Num==6){
			System.out.println("This is a Friday");
    }
		else if(Num==7){
			System.out.println("This is a Saturday");
    }
		else{
			System.out.println("Enter 1 to 7...");
    }
  }
}
