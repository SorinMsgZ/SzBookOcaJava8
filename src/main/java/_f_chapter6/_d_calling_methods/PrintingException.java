package _f_chapter6._d_calling_methods;

import java.io.FileNotFoundException;

public class PrintingException {
    public static void main(String[] args) throws Exception {
        try {
            hop();
        } catch (Exception e) {
            System.out.println("Print1 :" + e); // method 1
            System.out.println("Print2 :" + e.getMessage()); // method 2
            System.out.println("Print3 :");
            e.printStackTrace(); // method 3

            System.out.println("Print4 :");
            throw new RuntimeException();
        }
    }

    private static void hop() {
        throw new RuntimeException("cannot hop");
    }

    public void someMethod() throws FileNotFoundException {// throws a checked exception!
//        System.out.println("functioneaza");           // ok
//         throw new Exception();                         // DOES NOT COMPILE (broder)
//         throw new  IllegalArgumentException  ();         // ok (uncheked exception)
//         throw new  java.io.FileNotFoundException();  // ok
        throw new RuntimeException();               // ok (uncheked exception)
    }
}
