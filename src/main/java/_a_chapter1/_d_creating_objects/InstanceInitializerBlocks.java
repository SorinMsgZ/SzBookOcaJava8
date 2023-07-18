package _a_chapter1._d_creating_objects;

public class InstanceInitializerBlocks {
    public static void main(String[] args) { //first code block
        {//second code block
            System.out.println("Feathers");
        }
    }

    {//third code block + this is also a 'instance initializer' because it is outside a method
        System.out.println("Snowy");
    }
}
