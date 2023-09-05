package _f_chapter6._a_exceptions._iii_types.checked;

public class CheckedException {

    void fall() throws Exception {
        System.out.println("checked exception");
        throw new Exception();
    }

    public static void main(String[] args) throws Exception {
        CheckedException test = new CheckedException();
        test.fall();
    }
}
