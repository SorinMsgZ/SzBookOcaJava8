package _e_chapter5._b_abstract_classes;

public abstract class ParentWithNonAbstractMethod {
    /*abstract int variable; // DOES NOT COMPILE - a variable may not be marked 'abstract'*/

    abstract void abstractMethod();

    void nonAbstractMethod() {
        System.out.println("This non abstract method will be also inherited by the child methods");
        return;
    }

    /*static abstract void staticMethod(); // DOES NOT COMPILE static + abstract*/
    static void staticMethod() {
        System.out.println("\nThis is a static non abstract method - defined in the PARENT -, which won't be inherited by the child");
        System.out.println("\tIt may be hidden instead of overridden.");
    }

    void callStaticParentMethod(){
        staticMethod();
    }
}

class Child extends ParentWithNonAbstractMethod {

    @Override
    void abstractMethod() {
        System.out.println("implementing all abstract methods");
    }

    static void staticMethod() {
        System.out.println("\nThis is the CHILD version of the static non abstract method, defined in the parent");
    }

    void callStaticChildMethod(){
        staticMethod();
    }

    public static void main(String[] args) {
        Child c = new Child();
        c.nonAbstractMethod();
        c.callStaticParentMethod();
        c.callStaticChildMethod();
    }
}
