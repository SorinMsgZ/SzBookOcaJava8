package _e_chapter5._c_interfaces;

public abstract interface AccessModStaticMetInterface {
    public static final int x=1;

    interface PrivatePackageInnerInterface{}

    public interface PublicPackageInnerInterface{}

   /* protected interface ProtectedPackageInnerInterface{} // does not compile*/

    /*private interface PrivateInnerInterface{} // does not compile*/

    public default void defaultMethod(){
        System.out.println("this is a default interface method");
    }

    public static void voidMethod(){
        System.out.println("this is a static interface method, which won't be inherited");
    };

    public abstract void methodOfInterface();
}
