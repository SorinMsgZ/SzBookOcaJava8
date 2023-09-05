package _f_chapter6._a_exceptions._iii_types.unchecked;

public class UnheckedException {

    void fall() throws RuntimeException {
        //throw new RuntimeException();
    }

    public static void main(String[] args) {
        UnheckedException test = new UnheckedException();
        test.fall();
    }
}
