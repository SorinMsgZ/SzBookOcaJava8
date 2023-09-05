package _f_chapter6._b_try_statement;

public class HandleException {
    void explore() {
        try {
            fall();
            System.out.println("never get here");
        } catch (RuntimeException e) {
            getUp();
        }
        seeAnimals();
    }
    void fall() {  throw new RuntimeException(); }

    void getUp(){}
    void seeAnimals(){}

    public static void main(String[] args) {
        HandleException test = new HandleException();
        test.explore();
    }
}
