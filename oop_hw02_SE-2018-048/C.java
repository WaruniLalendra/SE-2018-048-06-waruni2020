//Create a new class A 
class A{
    int number;
    
    A(int number){
        this.number = number;
        System.out.println("The value of in class A: " + this.number);
    }
    
//Add an instance field to A and initialize it with some value (inside the constructor)
        //Add a method to A that prints out "I'm of type A" 
    void printMessage(){
        System.out.println("I'm of type A..");
    }
}

//Create another class B that extends A 
class B extends A{
    //Add the same instance field to B initialize it with a different value 
    int number;
    
    B(int number){
        super(number);
        this.number = number;
        System.out.println("The value of in class B: " + this.number);
    }
    
    //Add a method with the same signature to B that prints out "I,m of type B"
    void printMessage(){
        //super.printMessage();
        System.out.println("I'm of type B..");
    }
    
}


//Create a new class C with the main method.
public class C {

  
    public static void main(String[] args) {
           // Create an instance of B in the main method.
           //Print out the value of the instance field.
           B objB1 = new B(22);
           System.out.println();
           
           //Create an instance of B in the main method class C.
           B objB2 = new B(0);
           System.out.println();
           
           //Call the method you declared in A and print the value.
           objB2.printMessage();
           //But this method print the value we declared in B.
           System.out.println();
           
           //How can ou get our program to print both "I'm of type A" and "I'm of type B"?
           //By adding super.printMessage(); to the printMessage method in class B
           objB2.printMessage(); //uncomment the super.printMessage(); to give the desire result..
           
           // What happens if the line super(); is added as the last line inside the constructor?
           //It should always called at first. If not it gives an error.
           
           
    }
    
}
