package _e_chapter5._a_class_inheritance._3_access_modifiers;

public class InheritingDefaultVariable extends ParentWithPrivatePackageVar{

    public static void main(String[] args) {
        InheritingDefaultVariable test = new InheritingDefaultVariable();
        System.out.println(test.privatePackageVar); //it works because it is in the same package
        System.out.println(test.publicVar);
        System.out.println(test.protectedVar);
    }
}