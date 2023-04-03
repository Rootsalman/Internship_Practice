// import java.util.HashMap;
// import java.util.Map;
// class MapDemo{
//   public static void main(String args[]){
//     HashMap<Integer,String> map = new HashMap<Integer,String>();
//     map.put(1, "salman");
//     map.put(2,"Ayrun");
//     map.put(3,"Aishuu");
//     map.putIfAbsent(4, "Madesh");
//     System.out.println(map);
//     for(Map.Entry m: map.entrySet()){
//       System.out.println(m.getKey() +" "+m.getValue());
//     }
//   }
// }

import java.util.*;
class Student{
  String name,branch;
  int rollno,age;

 

  Student(String name,String branch,int rollno,int age){
    this.name=name;
    this.branch=branch;
    this.rollno=rollno;
    this.age=age;
  }
}

 

class StudentArrayList{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    ArrayList<Student> st=new ArrayList<Student>();

 

    for(int i=0;i<4;i++){
      st.add(new Student(sc.next(),sc.next(),sc.nextInt(),sc.nextInt()));
    }
    
  }
}