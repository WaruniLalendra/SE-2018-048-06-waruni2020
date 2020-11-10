//Create a class with instance methods, instance fields, static methods, and static fields  two from each 
class Class1{ 
    int number = 10;
    String str = "Hello";
    
    static double PI = 3.14;
    static int YEAR = 2020;
    
    void printInstantVariable(){
        //Access the instance variable inside the instance method 
        number = 1000;
        
        System.out.println("Value of instant variable is " + number);
        //Try to use the this keyword inside a class method 
        //It is always better to use this keyword because it is easy to identify these variables as this method's variables..
        System.out.println("Value of instant variable is " + this.number);
    }
    
    void accessVariableAndMethod(){
        // Access the class variable and class method inside the instance method 
        number = 100;     
        this.number = 100;
        
        printInstantVariable();
        this.printInstantVariable();
        
        //Access instance variables and instance methods inside the class methods 
        System.out.println("The static variable value is " + PI);
        System.out.println("The static variable value is " + Class1.PI);
        
        Class1.sayHi();
        
        
        //Access the class variable and the other class method inside the class method..
        //We cannot access instant variables and methods in another class unless this class is a sub
        //class of it or relevent methods and variables are static..
        Class2.method1InClass2();
        Class2.number2 = 22;
        
    }
    
    static void sayHi(){
        System.out.println("Hii...");
    }
    
    static void multiplyTwoNumbers(int num1, int num2){
        System.out.println(num1*num2);
    }
    
}

class Class2{
    static int number2 = 7;
    
    static void method1InClass2(){
        System.out.println("Hi I'm in class2...");
    } 
}

public class ClassDemo {

   
    public static void main(String[] args) {
       Class1 obj1 = new Class1();
       obj1.accessVariableAndMethod();
       
       Class2.method1InClass2(); //static methods does not need an object to be called..
    }
    
}
