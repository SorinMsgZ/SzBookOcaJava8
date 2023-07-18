package _x_appendix;

public class AppendixBStudyTipps {

    //float value = 102.0; // DOES NOT COMPILE

    float value1 = 102;
    float value2 = (int)102.0;
    //float value3 = 1f * 0.0; // DOES NOT COMPILE
    float value4 = 1f * (short)0.0;
    //float value5 = 1f * (boolean)0; // DOES NOT COMPILE


    public void testOperation(){
        int x = 0;
        while(++x < 5) { x+=1; }
        String message = x > 5 ? "Greater than" : "Less Than";
        System.out.println(message+","+x);
        /*Greater than,5
        Greater than,6
        Greater than,7
        Less than,5
        Less than,6
        Less than,7*/
    }

}
