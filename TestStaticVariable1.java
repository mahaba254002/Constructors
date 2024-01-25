//Java static property is shared to all objects.
class TestStaticVariable {
  int rollno;// instance variable
  String name;
  static String college = "ITS";// static variable

  TestStaticVariable(int r, String n) {
    this.rollno = r;
    this.name = n;
  }

  // method to display the values
  void display() {
    System.out.println(rollno + " " + name + " " + college);
  }
}

// Test class to show the values of objects
public class TestStaticVariable1 {
  public static void main(String args[]) {
    TestStaticVariable s1 = new TestStaticVariable(111, "Karan");
    TestStaticVariable s2 = new TestStaticVariable(222, "Aryan");
    // we can change the college of all objects by the single line of code
    // Student.college="BBDIT";
    s1.display();
    s2.display();
  }
}