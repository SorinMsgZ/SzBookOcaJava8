package _e_chapter5._a_class_inheritance._6_method_overriding;

public class InfiniteLoop {
    double infinite (){
        return infinite() + 2; //this is a recursive call
    }

    public static void main(String[] args) {
        InfiniteLoop test = new InfiniteLoop();
        test.infinite();
    }
}
