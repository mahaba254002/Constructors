public class Person {
  String name;
  int age;


  // Parameterized constructor
  public Person(String name, int age) {
      this.name = name;
      this.age = age;
  }

  public Person() {
  }

  // Method to display person details
  public void displayDetails() {
      System.out.println("Name: " + name);
      System.out.println("Age: " + age);
  }

  public static void main(String[] args) {
      // Creating an object using default constructor
      Person defaultPerson = new Person();
      defaultPerson.displayDetails();
      System.out.println();

      // Creating an object using parameterized constructor
      Person parameterizedPerson = new Person("Bakari mahaba", 25);
      parameterizedPerson.displayDetails();
  }
}
