package _e_chapter5._d_polymorphism;

public class CastingPractice {

    public static void main(String[] args) {
        ChildLemur lemur = new ChildLemur();

        ParentPrimate primate = lemur;

        ChildLemur lemur2 = lemur;

        ChildLemur lemur3 = (ChildLemur) primate;  //SZ: practic castez referinta

        int  x1 = lemur.lemurVariable;

        int x2 = primate.primateVar;
        // int x3 = primate.lemurVariable; // DOES NOT compile
        int x3 = ((ChildLemur) primate).lemurVariable;

        Object object = lemur;
        //int x4 =object.primateVar; // DOES NOT compile
        int x4 = ((ChildLemur) object).lemurVariable;


    }
}
