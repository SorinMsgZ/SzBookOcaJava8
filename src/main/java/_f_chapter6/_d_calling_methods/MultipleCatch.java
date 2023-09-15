package _f_chapter6._d_calling_methods;

public class MultipleCatch {

    public static void main(String[] args) {
        try{}
        catch(Error e){}
        catch(RuntimeException e){}

        try{}
        catch(RuntimeException e){}
        catch(Error e){}

        try{}
        catch(Error e){}
        catch(Exception e){}

    }
}
