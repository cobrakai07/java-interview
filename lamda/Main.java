
package lamda;

import java.util.List;

public class Main {
    public static void execute(FunctionalInterface functionalInterface) {
        functionalInterface.printMessage();
    }
    public static void sum(FunInterface2 funInterface2, List<Integer> list) {
        System.out.println(funInterface2.calculate(list));
    }
    public static void method(FunInterface3 funInterface3) {
        funInterface3.printMessage();
    }
    public static void methodLamda(LamdaInterface lamdaInterface, int a, int b) {
        System.out.println(lamdaInterface.calculate(a,b));
    }
    public static void main(String[] args) {

        // Implementing the FunctionalInterface using a class
        FunInterface3 funInterface3 = new Implementer();
        method(funInterface3);
        
        // Implementing the FunctionalInterface using an anonymous class
        FunctionalInterface myFunctionalInterface = new FunctionalInterface(){
            @Override
            public void printMessage() {
                System.out.println("Hello World");
            }
        };
       
        execute(myFunctionalInterface);

        FunInterface2 funInterface2=new FunInterface2() {
            @Override
            public int calculate(List<Integer> list) {
                int result=0;
                for (int i : list) {
                    result+=i;
                }
                return result;
            }
        };
        sum(funInterface2, List.of(1,2,3,4,5));

        // Implementing the FunctionalInterface using a lambda expression
        LamdaInterface lamdaInterface = (a,b) ->{return  a+b;};
        methodLamda(lamdaInterface, 10, 20);
    }
}


// Summary

// Define a functional interface with a single abstract method.
// Implement the functional interface using an anonymous class.
// Pass the function as an argument to another method that accepts the functional interface as a parameter.

// Using anonymous classes, you can pass functions around in Java without using lambda expressions, which is especially useful if you're working in a pre-Java 8 environment or if you prefer the anonymous class syntax.


// A functional interface in Java is an interface that contains exactly one abstract method. These interfaces are also known as Single Abstract Method (SAM) interfaces. Functional interfaces can have any number of default or static methods, but they must have only one abstract method. This single abstract method is what allows them to be used as the target for lambda expressions and method references.

// Functional interfaces are a key component of functional programming in Java, especially since the introduction of lambda expressions in Java 8. They provide a way to treat functionality as a method argument or to pass a block of code as data.

//u cannot have variables in functional interface, it must be final or effectively final