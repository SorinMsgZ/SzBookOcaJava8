package _f_chapter6._a_exceptions._i_throwing_exception;

public class ExplicitThrow {

    void throwCheckedExceptionWithoutMessage() throws Exception{
        throw new Exception();
    }

    /*int throwUndeclaredCheckedExceptionWithMessage() {
        throw new Exception("Ow! I fell."); //DOES NOT COMPILE
    }*/
    int throwDeclaredCheckedExceptionWithMessage() throws Exception{
        throw new Exception("Ow! I fell.");
    }

    void throwUncheckedExceptionWithoutMessage(){
        throw new RuntimeException();
    }
    void throwUncheckedExceptionWithMessage(){
        throw new RuntimeException("Ow! I fell.");
    }

    public static void main(String[] args) {
        ExplicitThrow test = new ExplicitThrow();
        //test.throwUncheckedExceptionWithoutMessage();
        test.throwUncheckedExceptionWithMessage();
    }


}
