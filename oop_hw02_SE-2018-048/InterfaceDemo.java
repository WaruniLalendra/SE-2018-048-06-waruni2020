
interface Interface1 {
    
    //Interface(); -------> constructors can not be added to an interface.

    public void method1(); //Methods in interfaces are by default abstract methods. They can not define.
    
    default void method2(){  //When we wants to define a method in interface we have to use default keyword. 
        System.out.println("show method2");
    }
    
    static void method3(){   //static methods can define inside an interface and can be called without an object.
        System.out.println("Show method3");
    }
    
    int NUM = 10;            // This is a variable in interface. They are by default final,staic and public.
    static String STR = "Hello";  // This is a static variable.
    static final double e = 2.718; // These type of variables are constant, which means cannot be change.
}

interface Interface2 extends Interface1{
    public void method4();
}

class Class1 implements Interface2{

    @Override
    public void method4() {
        System.out.println("show method4");
    }

    @Override
    public void method1() {
        System.out.println("show method1");
    }

}

public class InterfaceDemo {

    public static void main(String[] args) {
        
        //Interface Obj1 = new Interface();  --------> We can not create objects of an interface.
         
        Interface1 obj2 = new Interface1(){   //If we want to make object of an interface we have to use anonymous class for it.
                                public void method1(){
                                    System.out.println("Show method1");
                                }
                        };
        
        Interface1.method3(); // Static methods can call without using an object.
        
        System.out.println(Interface1.NUM); //We can call variables in interfaces without creating an object.
        System.out.println(Interface1.STR); //This is how we called static variables in interface --> Interface_name.variable_name
        System.out.println(Interface1.e);
        
        
    }
}
