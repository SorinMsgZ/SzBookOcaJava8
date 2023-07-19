package _b_chapter2._e_java_statements;

public class _h_ForEachLoopStatement {

    public static void main(String[] args) {
        java.util.List<String> values = new java.util.ArrayList<String>();
        values.add("Lisa");
        values.add("Kevin");
        values.add("Roger");

        // following "enhanced (for-each) for loop" is equivalent with the "standard for loop"
        for(String value : values) {
            System.out.print(value + ", ");
        }

        for(java.util.Iterator<String> i = values.iterator(); i.hasNext(); /*because of using Iterator the update statement is missing*/) {
            String value = i.next();
            System.out.print(value + ", ");
        }
    }
}
