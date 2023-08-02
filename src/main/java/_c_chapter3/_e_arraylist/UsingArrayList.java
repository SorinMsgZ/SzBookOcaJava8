package _c_chapter3._e_arraylist;

import java.util.ArrayList;

public class UsingArrayList {


    public static void main(String[] args) {

        ArrayList<String> flights2 = new ArrayList<>();
        flights2.add("sd1");
        flights2.add("sd2");
        System.out.println(flights2.toString());
        // [sd1, sd2] - prints in a nice way
//        flights2.add(1); //--> does not compile - string expected

        ArrayList list = new ArrayList();
        list.add("hawk");          // [hawk]
        list.add(Boolean.TRUE);    // [hawk, true]
        list.add(1); //this is a primitive
        System.out.println(list);  // [hawk, true]


        list.size();


    }

}
