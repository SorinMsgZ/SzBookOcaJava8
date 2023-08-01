package _c_chapter3._a_creating_manipulating_strings;

public class StringBuilderMethods {
    public static void main(String[] args) {

        //charAt(), indexOf(), length(), and substring()
        StringBuilder sb1 = new StringBuilder("animals");
        String sub = sb1.substring(sb1.indexOf("a"), sb1.indexOf("al"));
        int len = sb1.length();
        char ch = sb1.charAt(6);
        System.out.println(sub + " " + len + " " + ch);

        //append()
        StringBuilder sb2 = new StringBuilder().append(1).append('c');
        sb2.append("-").append(true);
        System.out.println(sb2);      // 1c-true

        //insert
        StringBuilder sb3 = new StringBuilder("animals");
        sb3.insert(7, "-");                   // sb = animals-
        sb3.insert(0, "-");                   // sb = -animals-
        sb3.insert(4, "-");                   // sb = -ani-mals
        System.out.println(sb3);

        //delete() and deleteCharAt()
        StringBuilder sb4 = new StringBuilder("abcdef");
        sb4.delete(1, 3);                  // sb = adef
        sb4.deleteCharAt(5);                   // throws an exception

        //reverse()
        StringBuilder sb5 = new StringBuilder("ABC");
        sb5.reverse();
        System.out.println(sb5);

        //toString()
        String s = sb5.toString();
    }
}
