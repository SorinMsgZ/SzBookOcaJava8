package _e_chapter5._c_interfaces;

public class DefaultMethods implements FirstInterface, SecondInterface {

    @Override
    public void defaultMethod() {
        FirstInterface.super.defaultMethod();

    }
}

interface FirstInterface {
    int var = 1;

    default void defaultMethod() {
        System.out.println("interface1");
    }

    default void otherDefaultMethod() {
        System.out.println("interface1 other method");
    }
}

interface SecondInterface {

    default void defaultMethod() {
        System.out.println("interface2");
    }
}
