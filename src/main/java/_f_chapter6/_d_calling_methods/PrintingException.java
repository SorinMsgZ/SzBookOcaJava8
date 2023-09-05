package _f_chapter6._d_calling_methods;

public class PrintingException {
    public static void main(String[] args) {
        try {
            hop();
        } catch (Exception e) {
            System.out.println(e); // method 1
            System.out.println(e.getMessage()); // method 2
            e.printStackTrace(); // method 3
        }
    }

    private static void hop() {
        throw new RuntimeException("cannot hop");
    }
}
