import java.util.ArrayList;
import java.util.*;
class Student implements Comparable<Student>{
 private int id;
  private String Name;
  private String Dept;
  private int Age;
  Student(int id,String Name,String Dept,int Age){
    this.id = id;
    this.Name = Name;
    this.Dept = Dept;
    this.Age = Age;
  }
public int getId() {
  if(id>st.id){
      return 1;
    }
    else if(id<st.id){
      return -1;
    }
    else{
      return 0;
    }
}
  public int compareTo(Student st) {
  if(age>st.age){
    return 1;
  }
  else if(age<st.age){
    return -1;
  }
  else{
     return 0;
  }
 
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return Name;
}
public void setName(String Name) {
	Name = Name;
}
public String getDept() {
	return Dept;
}
public void setDept(String Dept) {
	Dept = Dept;
}
public int getAge() {
	return Age;
}
public void setAge(int Age) {
	this.Age = Age;
  
}
}
class SortingBasedOnAge{
  public static void main(String args[]){
    ArrayList<Student> stu= new ArrayList<Student>();
    Scanner sc = new Scanner(System.in);
    for(int i=0;i<2;i++){
    stu.add(new Student(sc.nextInt(),sc.next(),sc.next(),sc.nextInt()));
  }
 Collections.sort(students);
    for(Student st:students){
      System.out.println(st.getid()+" "+st.getName()+""+st.getDept()+" "+st.getAge());
}
  }
}