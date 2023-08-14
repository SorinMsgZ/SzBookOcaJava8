package _d_chapter4._c_acces_modifiers;

public class PassByValueReference {
//    static String name = "Webby";
    public static void main(String[] args) {
        String name = "Webby";
        speak(name);
        System.out.println(name);
    }
    public static void speak(String name) {
        name = "Sparky";
    }
}
