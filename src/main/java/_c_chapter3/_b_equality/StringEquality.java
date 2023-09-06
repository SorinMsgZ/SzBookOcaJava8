package _c_chapter3._b_equality;

public class StringEquality {
    public static void main(String[] args) {
        String s1 = "abc"; //object1
        String s2 = new String("abc"); //object2
        System.out.println(s1.equals(s2));

        System.out.println(s1==s2); //false
        s1 = s1 + "";//object3
        System.out.println(s1==s2); //false
        s1 += "";//object4
        System.out.println(s1==s2); //false
        s1 = s1.concat("");//object4
        System.out.println(s1==s2); //false


        String s3 = "abc";//object1
        s1 = "ab";//object5
        System.out.println(s1==s3); //false
        s1 = s1.concat("c");//object6
        System.out.println(s1==s3); //false
        s1 = s1.replace("c","");//object7
        System.out.println(s1==s3); //false

    }
}
