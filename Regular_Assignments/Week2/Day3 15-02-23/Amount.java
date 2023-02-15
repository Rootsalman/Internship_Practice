import java.util.*;
class Amount{
  public static void main(String args[]){
    int Amount,n2000,n500,n200,n100,n50,n20,n10,n5,n2,n1;
     n2000=n500=n200=n100=n50=n20=n10=n5=n2=n1=0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Amount");
    Amount = sc.nextInt();
    if(Amount >= 2000)
			n2000 = Amount/2000;
			Amount = Amount-n2000 * 2000;
    
		if(Amount >= 500)
			n50 = Amount/500;
			Amount =  Amount-n500 * 500;
    
    if(Amount >= 200)
			n200 = Amount/200;
			Amount =  Amount-n200 * 200;
    
		if(Amount >= 100)
			n100 = Amount/100;
			Amount = Amount-n100 * 100;
    
		if(Amount >= 50)
			n50 = Amount/50;
			Amount =  Amount-n50 * 50;
    
    if(Amount >= 20)
			n20 = Amount/20;
			Amount =  Amount-n20 * 20;
    
    if(Amount >= 10)
			n10 = Amount/10;
			Amount =  Amount-n10 * 10;
    
    if(Amount >= 5)
			n5 = Amount/5;
			Amount =  Amount-n5 * 5;
    
    if(Amount >= 2)
			n2 = Amount/2;
			Amount =  Amount-n2 * 2;
    
    if(Amount >= 1)
			n1 = Amount;
 
		System.out.println("Total Number of Notes is= :"+ 
                 (n2000+n500+n200+n100+n50+n20+n10));
    	System.out.println("Total Number of coins is= :"+ 
                 (n5+n2+n1));
		System.out.println("2000 Notes = "+ n2000);
		System.out.println("500 Notes= "+ n500);
    System.out.println("200 Notes= "+ n200);
		System.out.println("100 Notes= "+ n100);
		System.out.println("50 Notes= "+ n50);
		System.out.println("20 Notes= "+ n20);
		System.out.println("10 Notes= "+ n10);
    System.out.println("5 $Coin= "+ n5);
    System.out.println("2 $Coin= "+ n2);
    System.out.println("1 $Coin= "+ n1);
	}
  }