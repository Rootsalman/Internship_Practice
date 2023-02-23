import java.util.Scanner;
class ArrayVowels{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    char arr[] = new char[5];
    System.out.println("Enter the array element :");
    for(char i=0;i<5;i++){
       arr[i] =sc.next().charAt(0);
    }
    System.out.println("vowels in element are :");
    for(int i=0;i<5;i++)
      if((arr[i]=='a' || arr[i]=='e'|| arr[i]=='i' || arr[i]=='o' || arr[i] =='u'))
     System.out.println(arr[i]);
  }
}