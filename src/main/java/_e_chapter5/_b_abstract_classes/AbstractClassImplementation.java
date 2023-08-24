package _e_chapter5._b_abstract_classes;

public abstract class AbstractClassImplementation {
    public abstract String getName();
}

/*public class Walrus extends AbstractClassImplementation {
// DOES NOT COMPILE, the first concrete class has to implement ALL abstract methods
}*/

abstract class Eagle extends AbstractClassImplementation {
}
