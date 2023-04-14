class GetThread extends Thread{
  public void run(){
    System.out.println("Thread is running");
  }
}
class ThreadDemo{
  public static void main(String args[]){
    GetThread t1=new GetThread();
    t1.start();
  }
}