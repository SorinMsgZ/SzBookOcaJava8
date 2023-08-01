package _c_chapter3._e_arraylist;

import java.util.ArrayList;

public class CreateArrayList {
    public static void main(String[] args) {
        //old way (before Java5)
        ArrayList list1 = new ArrayList();
        ArrayList list2 = new ArrayList(10);
        ArrayList list3 = new ArrayList(list2);

        //new way (after Java5)
        ArrayList<String> list4 = new ArrayList<String>();

        //new way (after Java7)
        ArrayList<String> list5 = new ArrayList<>(); //using the "diamond operator" because "<>" looks like a diamond
    }
}
