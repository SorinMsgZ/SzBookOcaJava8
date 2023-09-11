package _d_chapter4._c_acces_modifiers.test1;

public class Classroom {
    private int roomNumber;
    protected String teacherName;
    static int globalKey = 54321;
    public int floor = 3;
    Classroom (int r, String t){
        roomNumber =r;
        teacherName = t;
    }
}
