package _a_chapter1._j_destroying_objects;

public class Finalizer {
    protected void finalize() {
        System.out.println("Calling finalize");
    }

    public static void main(String[] args) {
        Finalizer f = new Finalizer();

    }
//TODO
   /* public class Finalizer {
        private static List objects = new ArrayList();
        protected void finalize()  {
            objects.add(this);  // Don't do this
        } }*/

}
