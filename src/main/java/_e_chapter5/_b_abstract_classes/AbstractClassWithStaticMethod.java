package _e_chapter5._b_abstract_classes;

public abstract class AbstractClassWithStaticMethod {

    public int var1 = 3;

    public int getVar1(){
        return var1;
    }

     //abstract void abstractMethod();

    static void staticMethod(){
        System.out.println("test");
    }

    final static void finalStatic(){
        System.out.println("final and static");
    }

    static final void staticFinal(){
        System.out.println(" static and final");
    }
}
