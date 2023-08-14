package _d_chapter4._c_acces_modifiers;

public class OrderOfInitialization2 { //this is the single class

      public static void main(String[] args) { //this is also a static method but not a static variable
        System.out.println("read to construct");
        new OrderOfInitialization2();
    }
    private String name = "Torchie";
    { System.out.println(name); }
    private static int COUNT = 0;
    static { System.out.println(COUNT); }
    { COUNT++;  System.out.println(COUNT); }
    public OrderOfInitialization2() {
        System.out.println("constructor");
    }
  /*  public static void main(String[] args) { //this is also a static method but not a static variable
        System.out.println("read to construct");
        new OrderOfInitialization2();
    }*/
}