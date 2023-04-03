// 9. Shopping Cart: Create a class called ShoppingCart that stores a collection of items in a ArrayList. The class should have methods to add, remove, and display items in the cart, as well as to calculate the total cost of the items in the cart.

import java.util.*;
class  ShoppingCart{
  Scanner sc = new Scanner(System.in);
  ArrayList<String> l = new ArrayList<>();

void add(){
  
  // String[] item = new String[3];
  // for(int i =0; i<3; i++){
  //   item[i]=sc.next();
  l.add("Mobile");
  l.add("Laptop");
  l.add("IPhone");
 // }
}
void remove(){
  l.remove(0);
}
  void display(){
    System.out.println(l);
  }
}
public class ShopCart{
  public static void main(String args[]){
    ShoppingCart s = new ShoppingCart();
    s.add();
    s.remove();
    s.display();
  }
}