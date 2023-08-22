package _e_chapter5._a_class_inheritance._5_this_super;


public class Child extends _e_chapter5._a_class_inheritance._5_this_super.Parent {


    Child() {

    }

    Child(int var1){
        this();
    }

    void someChildMethod() {
        super.var1 =1;
    }

    public static void main(String[] args) {

        Child testChild = new Child();
        testChild.someChildMethod();
        System.out.println(testChild.var1);




    }
}
