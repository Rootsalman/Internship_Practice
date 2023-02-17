import java.util.Scanner;
class Password{
	public static void main(String args[])
    {
        String  password;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter password:");
        password = s.next();
        if(password.equals("Messi"))
        {
            System.out.println("Welcome! Valid Password");
        }
        else
        {
            System.out.println("OH NO!Invalid Password");
        }
    }
}