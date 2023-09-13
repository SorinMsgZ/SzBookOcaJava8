package _e_chapter5._a_class_inheritance._3_access_modifiers;

public interface AssumedPublicInterface {

    void test();

    static void staticInterfaceMethod(){
        System.out.println("test");
    }

    default void defaultInterfaceMethod(){
        System.out.println("default");
    }

     //static default anotherInterfaceMethod(){}; //does not compile

}
