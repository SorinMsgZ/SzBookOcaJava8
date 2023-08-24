package _e_chapter5._a_class_inheritance.y_hiding_variables;

public class ChildMouse extends ParentRodent {
    protected int tailLength = 8;

    public void getMouseDetails() {
        System.out.println("[tail=" + tailLength + ",parentTail=" + super.tailLength + "]");
    }

    public static void main(String[] args) {
        ChildMouse childMouse = new ChildMouse();
        childMouse.getRodentDetails();
        childMouse.getMouseDetails();
    }
}
