package _e_chapter5._a_class_inheritance._7_hiding_methods;

public class ChildPanda extends ParentBear{
        public static void eat() {
            //SZ: This eat() method in the child class hides the eat() method in the parent class
            // Because they are both marked as static, this is not considered an overridden method.
            System.out.println("Panda bear is chewing");
        }
        public static void main(String[] args) {

            ChildPanda.eat(); //Panda bear is chewing
            ParentBear.eat(); //Bear is eating
        }

    /*

    The eat() method in the
    child class hides the eat() method in the parent class
    Because they are both marked as static, this is not considered an overridden method.
    */
}
