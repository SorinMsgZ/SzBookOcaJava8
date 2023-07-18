package _a_chapter1._g_default_initialization_of_variables;

import java.util.Date;

public class DefaultInitializationOfVariables {
    static int b; //this is a class variable because it has the "static" keyword before
    class LocalVariable {
        public int notValid() {
            int y = 10;
            int x;
            //int reply = x + y; // DOES NOT COMPILE
            int reply = 0;
            return reply;
        }

        public void findAnswer(boolean check) {
            int answer;
            int onlyOneBranch;
            if (check) {
                onlyOneBranch = 1;
                answer = 1;
            } else {
                answer = 2;
            }
            System.out.println(answer);
            //System.out.println(onlyOneBranch); // DOES NOT COMPILE
        }
    }

    class InstanceOrClassVariable {
        int a; //this is a instance variable (or also called a "field")
        //static int b; //DOES NOT COMPILE because "static" is not supported in inner classes
        public void test(){
            int c = a+0;
            int d = b+0;
            Date s; // this is an object reference -> initialized with null
        }
    }
}
