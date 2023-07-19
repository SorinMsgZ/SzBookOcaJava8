package _b_chapter2._e_java_statements;

public class _d_SwitchStatement {

    /*Data types supported by switch statements include the following:
            ■ int and Integer
            ■ byte and Byte
            ■ short and Short
            ■ char and Character
            ■ int and Integer
            ■ String
            ■ enum values
*/

    public void default1() {
        int dayOfWeek = 5;
        switch (dayOfWeek) {
            default:
                System.out.println("Weekday");
                break;
            case 0:
                System.out.println("Sunday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
        }
    }

    public void default2() {
        int dayOfWeek = 5;
        switch (dayOfWeek) {

            case 0:
                System.out.println("Sunday");
            default:
                System.out.println("Weekday");
            case 6:
                System.out.println("Saturday");
                break;
        }
    }

    public void default3() {
        int dayOfWeek = 6;
        switch (dayOfWeek) {

            case 0:
                System.out.println("Sunday");
            default:
                System.out.println("Weekday");
            case 6:
                System.out.println("Saturday");
                break;
        }
    }

    public void default4() {
        int dayOfWeek = 0;
        switch (dayOfWeek) {

            case 0:
                System.out.println("Sunday");
            default:
                System.out.println("Weekday");
            case 6:
                System.out.println("Saturday");
                break;
        }
    }

    private int getSortOrder(String firstName, final String lastName) {
        String middleName = "Patricia";
        final String suffix = "JR";
        int id = 0;
        switch (firstName) {
            case "Test":
                return 52;
                //The first case statement compiles without issue using a String literal and is a good
        // example of how a return statement, like a break statement, can be used to exit the switch statement early.
            /*case middleName:  // DOES NOT COMPILE
                id = 5;
                break;*/
            case suffix:
                id = 0;
                break;
           /*case lastName:  // DOES NOT COMPILE
                id = 8;
                break;
            case 5:  // DOES NOT COMPILE
                id = 7;
                break;
            case 'J':  // DOES NOT COMPILE
                id = 10;
                break;
            case java.time.DayOfWeek.SUNDAY:  // DOES NOT COMPILE
                id = 15;
                break;*/
        }
        return id;
    }


    public static void main(String[] args) {
        _d_SwitchStatement t1 = new _d_SwitchStatement();
        System.out.println("test default1: ");
        t1.default1();
        System.out.println("test default2: ");
        t1.default2();
        System.out.println("test default3: ");
        t1.default3();
        System.out.println("test default4: ");
        t1.default4();
        System.out.println("test case values: ");
        t1.getSortOrder("Test", "b");
    }
}
