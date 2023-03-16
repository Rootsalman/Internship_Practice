interface Product{
  int QuaOne=40;
  int QuaTwo=50;
  int QuaThree=80;
  void getName();
  void getPrice();
  void getQuantity();
  void removeProduct();
  void addProduct();
  void getTotalCost();
}
class PointOfSale implements Product{
  public void getName(){
    
  }
  public void getPrice(){
    int p1Price=2000;
    int p2Price=4000;
    int p3Price=3000;
    int total_price=p1Price+p2Price+p3Price;
    System.out.println("the tota price is "+total_price);
  }
  public void getQuantity(){
    int Qua1Q=40;
    int Qua2=50;
    int Qua3=80;
    int Tot_Qua=Qua1Q+Qua2+Qua3;
    System.out.println("the total quantity is "+Tot_Qua);
  }
  public void removeProduct(){
    int removeP1=QuaOne-10;
    int removeP2=QuaTwo-20;
    int removeP3=QuaThree-15;
    int remaining_product=removeP1+removeP2+removeP3;
    System.out.println("rmaining products are"+remaining_product);
  }
  public void addProduct(){
    int addP1=QuaOne+15;
    int addP2=QuaTwo+12;
    int addP3=QuaThree+13;
    int additional_product=addP1+addP2+addP3;
    System.out.println("after adding products "+additional_product);
  }
  public void getTotalCost(){
    int priceP1=QuaOne*2000;
    int priceP2=QuaQuaTwo*4000;
    int priceP3=QuaThree*3000;
    int total_cost=priceP1+priceP2+priceP3;
    System.out.println("total price is "+total_cost);
  }
  
}
class Task1{
  public static void main(String args[]){
    Product p=new PointOfSale();
    p.getQuantity();
    p.getPrice();
    p.getTotalCost();
    p.removeProduct();
    p.addProduct();
    
  }
}