import java.util.Scanner;
class RockPaperScissor{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Select option Rock or Paper or Scissor");
    String User_Choice;
    String Computer_Choice;
     System.out.println("Enter the user choice");
    User_Choice = sc.next();
     System.out.println("Enter the computer choice");
    Computer_Choice = sc.next();
    if(User_Choice.equals("Computer_choice")){
       System.out.println("The game is TIE");
    }
    else if((User_Choice.equals("Rock")&&Computer_Choice.equals("Paper"))|| 
       (User_Choice.equals("Paper")&&Computer_Choice.equals("Scissor"))||
      (User_Choice.equals("Scissor")&&Computer_Choice.equals("Rock"))){
      System.out.println("User Wins");
      }
       else if(Computer_Choice.equals("rock") && (User_Choice.equals("Paper")) || (Computer_Choice.equals("Paper") && 
 (User_Choice.equals("Scissor")))  || (Computer_Choice.equals("Scissor") && User_Choice.equals("Rock"))){
      System.out.println("Computer Wins");
  }
    else
      System.out.println("invalid input");
  }
}