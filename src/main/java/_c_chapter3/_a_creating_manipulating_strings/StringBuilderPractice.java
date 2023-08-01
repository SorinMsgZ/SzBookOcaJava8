package _c_chapter3._a_creating_manipulating_strings;

public class StringBuilderPractice {
    public static void main(String[] args) {

        //without StringBuilder
        String alpha1 = "";
        for (char current = 'a'; current <= 'z'; current++)
            alpha1 += current;

        System.out.println(alpha1);


        //with StringBuilder
        StringBuilder alpha2 = new StringBuilder();
        for (char current = 'a'; current <= 'z'; current++)
            alpha2.append(current);

        System.out.println(alpha2);

    }
}
