package chapter1.objects;

public class InitializationOrder1 { // run 2nd - creates the object
    private String name = "Fluffy"; // run 3rd - initialize the field

    {
        System.out.println("setting field");
    } // run 4th - run the instance initializer

    public InitializationOrder1() { // run 5th - return to the constructor
        name = "Tiny";
        System.out.println("setting constructor");
    }

    public static void main(String[] args) { // run 1st
        InitializationOrder1 chick = new InitializationOrder1(); // run 2nd - creates the object
        System.out.println(chick.name); // run 6 th

    }

   /*
   RESULT:
   *setting field
   *setting constructor
   *Tiny
    */
}