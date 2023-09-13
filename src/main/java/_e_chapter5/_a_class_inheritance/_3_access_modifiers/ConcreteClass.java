package _e_chapter5._a_class_inheritance._3_access_modifiers;

public class ConcreteClass implements  AssumedPublicInterface{

    @Override
    public void test() {

    }

    public static final void someMethod(){}

    public static void main(String[] args) {
        ConcreteClass concreteClass = new ConcreteClass();

        concreteClass.test();
        concreteClass.defaultInterfaceMethod();
        //concreteClass.staticInterfaceMethod(); // does not compile
    }
}
