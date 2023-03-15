interface operation{
  void Add();
  void mull();
  void Sub();
  void Div();
  
}
class calculator implements operation{
  public void Add(){
    int a=10,b=20;
  System.out.println((a+b));
  }

  public void mull(){
    int a=10,b=20;
  System.out.println((a*b));
  }

  public void Sub(){
    int a=10,b=20;
  System.out.println((a-b));
  }


  public void Div(){
    int a=10,b=20;
  System.out.println((a/b));
  }
}

class InterfaceCalculator{
  public static void main(String args[]){
    operation opt = new calculator();
    opt.Add();
    opt.mull();
    opt.Sub();
    opt.Div();
  }
}