class Bank{
  void rateofinterest(){
    System.out.println("The rate of interest is 90rs");
  }
}
class SBI extends Bank{
  void rateofinterest(){
    System.out.println("The rate of interest is 19rs");
}
}
class HDFC extends Bank{
  void rateofinterest(){
    super.rateofinterest();
    System.out.println("14rs");
  }
}
  class PolyMethodOverloading{
    public static void main(String args[]){
      HDFC hdfc = new HDFC();
      hdfc.rateofinterest();
    }
  }