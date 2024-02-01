# CONSTRUCTORS

- A constructor is a special method used to initialize objects.
- It is called when an object of a class is instantiated.
- Constructors are invoked when a class is instantiated, and memory is allocated for the object.

## Types of CONSTRUCTORS:

### Default Constructor:

A default constructor is a constructor that does not accept any value. It is mainly used to **initialize the instance variables** with default values. The default constructor is invoked implicitly by the compiler if there is no constructor defined in the class.

### Parametrized Constructors:

The parametrized constructor is the one that can initialize the instance variables with the given values.

## Rules of Constructors:

- The constructor name must be the same as the class name.
- Constructors must not have a return type, not even void.


# Static Keyword
 - Used to declare members (variables, methods, and nested classes) that belong to the class itself rather than instances of the class. 
 - When used, it primarily affects the scope, visibility, and behavior of members
 - It is also used for memory management
   
  ## Scenarios where static keyword impacts memory management
  - *Shared Memory*: When a variable is declared as static, it is stored in a fixed memory location associated with the class itself, rather than being allocated separately for each instance of the class. This means that all instances of the class share the same memory location for the static variable. By sharing memory, the overall memory footprint can be reduced, especially if the static variable holds a large amount of data.
    
  - *Caching and Optimization*: Static variables can be used for caching frequently used data, which can help improve performance by reducing the need for repeated calculations or data retrieval. By storing data in a static variable, it can be shared across multiple instances of the class, reducing the memory and computational overhead.


  ### Static variables
  - used to refer to the common property of all objects. It gets memory only once in the class area at the time of class loading.
  - Problem without static variable
- ***class Student{  
     int rollno;  
     String name;  
     String college="ITS";  
}***

 - *Suppose there are 500 students in my college, now all instance data members will get memory each time when the object is created. All students have its unique rollno and name, so instance data member is good in such case. Here, "college" refers to the common property of all objects. If we make it static, this field will get the memory only once hence saving memory or else will get memory each time when the instance is created  *


   ### Static Methods
   - It belongs to a class rather than an object
   - Can be invoked without the need of creating an instance of a class
   - Able to access static data members and change value of it.

   - Cannot use non static data members or call non static methods directly.
   
    #### Reason why main method is static ####
    - It is because the object is not required to call a static method. If it were a non-static method, JVM creates an object first then call main() method that will lead the problem of extra memory allocation.
