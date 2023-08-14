package _d_chapter4._c_acces_modifiers;

public class OrderOfInitialization3 {
    static {
        add(2);
    }

    static void add(int num) {
        System.out.print(num + " ");
    }

    OrderOfInitialization3() {
        add(5);
    }

    static {
        add(4);
    }

    {
        add(6);
    }

    static {
        new OrderOfInitialization3();
    }

    {
        add(8);
    }

    public static void main(String[] args) {
        //no code here and the program still prints something out
    }

}

