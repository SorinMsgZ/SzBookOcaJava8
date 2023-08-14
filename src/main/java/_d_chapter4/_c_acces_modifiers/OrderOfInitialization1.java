package _d_chapter4._c_acces_modifiers;

public class OrderOfInitialization1 { //this is class 1
    private String name = "Torchie";

    {
        System.out.println(name);
    }

    private static int COUNT = 0; //this is the 3rd thing that will initialize

    static {
        System.out.println("this is the 4th thing that will initialize - class 1");
        System.out.println(COUNT);
    }

    static {
        COUNT += 10;
        System.out.println(COUNT);
    }

    public OrderOfInitialization1() {
        System.out.println("constructor");
    }
}

class CallInitializationOrderSimple {//this is class 2 from where class 1 is called

    static{
        System.out.println("this is the 1st thing that will initialize - from class 2");
    }
    public static void main(String[] args) {
        System.out.println("this is the 2nd thing that will initialize - from class 2");
        OrderOfInitialization1 init = new OrderOfInitialization1();
    }
}


