//with using third variable
class Swap2Num{
public static void main(String[] args) {

        int num1=10,num2=20;

        System.out.println("--Before swap--");
        System.out.println("First number = " + num1);
        System.out.println("Second number = " + num2);


        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("--After swap--");
        System.out.println("First number = " + num1);
        System.out.println("Second number = " + num2);
    }
}
