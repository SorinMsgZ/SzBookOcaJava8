package _d_chapter4._c_acces_modifiers.test2;

import _d_chapter4._c_acces_modifiers.test1.Classroom;

public class School {
    public static void main(String[] args) {
        //System.out.println(Classroom.globalKey); //does NOT compile because of default access
        //Classroom room = new Classroom(101, ""Mrs. Anderson"); //does NOT Compile
                //the constructor has default access and " is aditional;
        //System.out.println(room.roomNumber);

    }
}
