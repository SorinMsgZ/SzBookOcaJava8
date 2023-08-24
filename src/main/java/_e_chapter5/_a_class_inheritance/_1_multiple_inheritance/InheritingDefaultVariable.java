package _e_chapter5._a_class_inheritance._1_multiple_inheritance;

import _e_chapter5._a_class_inheritance._3_access_modifiers.ParentWithPrivatePackageVar;

public class InheritingDefaultVariable extends ParentWithPrivatePackageVar {
    public static void main(String[] args) {
        InheritingDefaultVariable test = new InheritingDefaultVariable();

        System.out.println(test.protectedVar);
        System.out.println(test.publicVar);
        /*System.out.println(test.privatePackageVar);*/ //Compile error
    }
}
