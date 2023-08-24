package _e_chapter5._c_interfaces;

public class ConcreteClass extends ParentAbstractClass implements ParentInterface{
    @Override
    public void abstractMethod() {
        System.out.println("Implementing the abstract method from the abstract class and also from the interface.");
    }

    public static void main(String[] args) {
        ConcreteClass concreteClass = new ConcreteClass();

        ParentAbstractClass parentAbstractClass = concreteClass;
        ParentInterface parentInterface = concreteClass;

        System.out.println("Checking the power of polymorphism");
        parentAbstractClass.abstractMethod();
        parentInterface.abstractMethod();

    }
}
