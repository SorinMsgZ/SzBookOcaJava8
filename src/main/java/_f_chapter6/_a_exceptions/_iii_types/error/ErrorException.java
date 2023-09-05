package _f_chapter6._a_exceptions._iii_types.error;

public class ErrorException {

    void fall() throws Error {
        System.out.println("error");
        throw new Error();
    }

    public static void main(String[] args) {
        ErrorException test = new ErrorException();
        test.fall();
    }
}
