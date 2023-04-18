class Address{
  private String city;
  private String city_code;
  private String state;

  public Address(String city,String city_code,String state){
    this.city = city;
    this.city_code = city_code;
    this.state = state;
  }

public String getCity() {
	return city;
}
public String getCity_code() {
	return city_code;
} 
  public String getState(){
    return state;
  }
}
class Person{
  private String name;
  private int age;
  private Address address;

  public Person(String name, int age, Address address){
    this.name = name;
    this.age= age;
    this.address =address;
  }

public String getName() {
	return name;
}
public int getAge() {
	return age;
}
public Address getAddress() {
	return address;
}
}
public class IaAndHasaRelation{
  public static void main(String args[]){
    Address add = new Address("bangalore","581112","Karnataka");
    Person per = new Person("messi",21,add);
    System.out.println("name :" +per.getName());
    System.out.println("age :" +per.getAge());
    System.out.println("address is :" +per.getAddress().getCity_code());
  }
}