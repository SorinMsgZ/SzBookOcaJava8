package _d_chapter4._c_acces_modifiers;

public class StaticVsInstance {
    private String name = "Static class";

    //    public static final int ABC = 0;
    public final static int ABC = 0; //with changed order of specifiers

    public static void first() {
    }

    ;

    public static void second() {
    }

    public void third() {
        System.out.println(name);
    }

//    public static final void testOrderMethod(){}

    public final static void testOrderMethod() {
    }//with changed order of specifiers

    public static void main(String[] args) {
        first();
        second();
//        third() //-does not compile //calling third as an static method


        StaticVsInstance x = new StaticVsInstance();//call third as an instance method1
        x.third();

        new StaticVsInstance().third(); //call third as an instance method2
    }
}
