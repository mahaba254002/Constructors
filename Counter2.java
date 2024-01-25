class Counter2{  
static int count=0;//with static will get memory only once and retain its value leading to output 1 2 3 
  //instance variable will get memory each time when the instance is created leading to output 1 1 1 
  
Counter2(){  
count++;//incrementing the value of static variable  
System.out.println(count);  
}  
  
public static void main(String args[]){  
//creating objects  
Counter2 c1=new Counter2();  
Counter2 c2=new Counter2();  
Counter2 c3=new Counter2(); 
}  
}