import java.util.*;
class Array2List{
  public static void main(String args[]){
   //  List list=new ArrayList();
   //  list.add(123);
   //  list.add("laitha");
   //  list.add(56.75f);
   //  System.out.println(list);
   //  for( Object obj:list){
   //    System.out.println(obj);
   //  }
 
   //  List list=new ArrayList();
   //  Scanner sc=new Scanner(System.in);
   //  list.add(sc.next());
   //  list.add(sc.next());
   //  list.add(sc.next());
   //  System.out.println(list);
   //  for(Object str:list){
   //    System.out.println(str);
   //  }
 
   //  List<Integer> list=new ArrayList<Integer>();
   //  list.add(123);
   //  list.add(124);
   //  list.add(127);
   //  list.add(10);
   // System.out.println(list);
   //  for(Integer i:list)
   //  {
   //    System.out.println(i);
   //  }
   //  list.set(1,27);
   //  list.remove(0);
   //  System.out.println(list);
   //  System.out.println(list.indexOf(10));
 
    // List<Float> list=new ArrayList<Float>();
    // Scanner sc=new Scanner(System.in);
    // list.add(sc.nextFloat());
    // list.add(sc.nextFloat());
    // list.add(sc.nextFloat());
    // list.add(sc.nextFloat());
    // System.out.println(list);
    // for(Float i:list)
    // {
    //   System.out.println(i);
    // } 
    // list.set(1, 1.1f);
    // System.out.println(list);

     // List<Integer> list=new ArrayList<Integer>();
   //  list.add(123);
   //  list.add(124);
   //  list.add(127);
   // System.out.println(list);
   //  for(Integer i:list)
   //  {
   //    System.out.println(i);
   //  }
 
    // List<Float> list=new ArrayList<Float>();
    // Scanner sc=new Scanner(System.in);
    // list.add(23.445f);
    // list.add(12.34f);
    // list.add(45.67f);
    // list.add(78.90f);
    // System.out.println(list);
    // System.out.println(list.get(2));
    // list.set(1,23.45f);
    // //list.remove(2);
    // System.out.println(list.indexOf(45.67f));
    //  System.out.println(list);
    // //ArrayList2
    //   List<Float> list1=new ArrayList<Float>();
    // list1.addAll(list);
    // System.out.println(list1);
 
    // List<String> fruits=new ArrayList<String>();
    // fruits.add("Orange");
    // fruits.add("apple");
    // fruits.add("Mango");
    // int count=0,index=0;
    // for(String str:fruits){
    // if(str.equals("apple")){
    //   count++;
    //  index=fruits.indexOf("apple");
    //   break; 
    // }
    // }
    //   if(count==1){
    //     System.out.println("found at position "+index);
    //   }
    //   else
    //   {
    //     System.out.println("not found");
    //   }
    
    List<Integer> ls=new ArrayList<Integer>();
    Scanner sc=new Scanner(System.in);
    System.out.println("enter elements");
    for(int i=0;i<5;i++){
      ls.add(sc.nextInt());
    }
     System.out.println(ls);
    System.out.println("even numbers are:");
     for(Integer num:ls){
       if(num%2==0){
         System.out.println(num);
       }
     }
    
   
  
  }
}