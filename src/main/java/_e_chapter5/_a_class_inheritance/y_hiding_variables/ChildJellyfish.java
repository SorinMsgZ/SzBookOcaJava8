package _e_chapter5._a_class_inheritance.y_hiding_variables;

public class ChildJellyfish extends  ParentAnimal{
    public int length = 5;
    public static void main(String[] args) {
        ChildJellyfish jellyfish = new ChildJellyfish();
        ParentAnimal animal = new ChildJellyfish();
        System.out.println(jellyfish.length);
        System.out.println(animal.length);
    }
}
