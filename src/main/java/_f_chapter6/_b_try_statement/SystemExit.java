package _f_chapter6._b_try_statement;

public class SystemExit {
    int a, b;
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

    void getUp(){
        System.out.println("get up before system exit");
       // System.out.println(a/b); //arithmetic exception
        System.exit(12345);
    }
    void seeAnimals(){}

    public static void main(String[] args) {
        SystemExit test = new SystemExit();
        test.explore();
    }
}
