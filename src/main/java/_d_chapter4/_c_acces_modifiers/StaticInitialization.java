package _d_chapter4._c_acces_modifiers;

public class StaticInitialization {
    //    private int one; // in this case one is an instance variable: the static initializer can not access the instance variable
    private static int one;
    private static final int two;
    private static final int three = 3;

    private static final int CONSTANT;

    private String nonConstant;
    private static String staticNonFinal;

    //    private static final int four;     // DOES NOT COMPILE

    {//this is an "instance" initializer
        nonConstant = "this is an instance variable"; //does not compile
        staticNonFinal = "this is a static but not final variable - called from an INSTANCE initializer";
    }

    static {//this is a "static" initializer
        one = 1;
        two = 2;
//        three = 3;     // DOES NOT COMPILE
//        two = 4;     // DOES NOT COMPILE

        CONSTANT = 1+12;
//        nonConstant = "this is not a constant"; //does not compile

        staticNonFinal = "this is a static but not final variable - called from an STATIC initializer";
    }

/*{//this is an "instance" initializer
        nonConstant = "this is an instance variable"; //does not compile
        staticNonFinal = "this is a static but not final variable - called from an INSTANCE initializer";
    }*/

    public static void main(String[] args) {
        System.out.println(CONSTANT);

        StaticInitialization t = new StaticInitialization();
        System.out.println(t.nonConstant);

        System.out.println(staticNonFinal);
    }
}
