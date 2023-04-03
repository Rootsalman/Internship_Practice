import java.util.PriorityQueue;
class QueueDemo{
  public static void main(String args[]){
    PriorityQueue<String> dd = new PriorityQueue<String>();
    System.out.println("The fruits are :");
    dd.add("Cherry");
    dd.add("Banana");
    dd.add("peach");
    dd.add("Orange");
    System.out.println(dd);
  }
}