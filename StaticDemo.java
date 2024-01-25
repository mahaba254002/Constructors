class MathUtils {

  static int add(int a, int b) { 
      return a + b;
  }

  static int count = 0; 
  static void incrementCount() {
      count++;
  }
  int maths(){
    int x=45;
    int y=5;
    int z=x+y;
    return z;
  }
}

public class StaticDemo {
  public static void main(String[] args) {
      // Accessing static variable
      System.out.println("Initial count: " + MathUtils.count);

      // Accessing static method without creating an instance
      int sum = MathUtils.add(5, 3);
      System.out.println("Sum: " + sum);

      //MathUtils.maths(); // Will show error confirming that cannot access non static class directly without creating instance of class
      MathUtils ut=new MathUtils();
      int stt=ut.maths();
      System.out.println("Value for non static class :"+stt);

      // Changing the value of static variable
      MathUtils.count = 10;
      System.out.println("Modified count: " + MathUtils.count);

      // Incrementing the static variable
      MathUtils.incrementCount();
      System.out.println("Updated count: " + MathUtils.count);


  }
}