package _e_chapter5._a_class_inheritance._x_overriding_methods;

class Marsupial {
    public boolean isBiped() {
        return false;
    }

    public void getMarsupialDescription() {
        System.out.println("Marsupial walks on two legs: " + isBiped());
    }
}
