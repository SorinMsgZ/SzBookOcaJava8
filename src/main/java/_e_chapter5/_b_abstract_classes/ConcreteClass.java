package _e_chapter5._b_abstract_classes;

public class ConcreteClass extends AbstractClassWithStaticMethod{

     int x = getVar1();
    public static void main(String[] args) {
        staticMethod();

        finalStatic();

        staticFinal();

        ConcreteClass test = new ConcreteClass();
        System.out.println(test.x);
    }

}
