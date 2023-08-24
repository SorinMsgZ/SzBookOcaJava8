package _e_chapter5._b_abstract_classes;

public abstract class StaticMethodAbstractClass {

    static void staticMethod(){
        System.out.println("This is a static method");
    };
}

class ImplementationClass extends  StaticMethodAbstractClass{

    public static void main(String[] args) {
        ImplementationClass test = new ImplementationClass();

        /*test.staticMethod; //does not work*/
    }

};
