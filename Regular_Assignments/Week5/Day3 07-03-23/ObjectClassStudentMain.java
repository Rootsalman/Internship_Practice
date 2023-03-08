class ObjectClassStudent {
  int id;
  String name;
  String branch;
  double sub1, sub2, sub3;

  void Average() {
    double Average = (sub1 + sub2 + sub3) / 3;
    System.out.println(name+" average marks is :" + Average);
  }

  void percentage() {
    double totalmarks = sub1 + sub2 + sub3;
    double per = (totalmarks / 300) * 100;
    System.out.println(name + " percentage is" + per);
  }
}
  class ObjectClassStudentMain{
     public static void main(String args[]) {
    Student s1 = new Student();
    s1.id = 69;
    s1.name = "Salman";
    s1.branch = "CSE";
    s1.sub1 = 65.9;
    s1.sub1 = 99.9;
    s1.sub1 = 78.9;
    s1.Average();
    s1.percentage();
        Student s2 = new Student();
    s2.id = 96;
    s2.name = "Neymar";
    s2.branch = "ISE";
    s2.sub1 = 78.9;
    s2.sub1 = 91.9;
    s2.sub1 = 55.9;
    s2.Average();
    s2.percentage();
  }
}

 