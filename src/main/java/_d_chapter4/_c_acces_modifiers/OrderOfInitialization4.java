package _d_chapter4._c_acces_modifiers;

public class OrderOfInitialization4 {

    static String result = "";

    {
        result += "c";
    }

    static {
        result += "u";
    }

    {
        result += "r";
    }
}

class OrderDriver {
    public static void main(String[] args) {
        System.out.print(OrderOfInitialization4.result + " ");
        System.out.print(OrderOfInitialization4.result + " ");
        new OrderOfInitialization4();
        new OrderOfInitialization4();
        System.out.print(OrderOfInitialization4.result + " ");
    }
}
