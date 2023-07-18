package _a_chapter1._f_declaring_and_initializing_variables;

public class Identifiers {
    /*
    // variables, methods, classes, and fields.
    1.The name must begin with a letter or the symbol $ or _.
    2.Subsequent (next) characters may also be numbers (or letter, digit, $ or _).
    3.You cannot use the same name as a Java reserved word.
    */

    int Public; // it works because it is a modified identifier
    // int public; //DOES NOT COMPILE
    int testvar;
    // int &sfsf; //DOES NOT COMPILE
    int $works;
    int _works;

    //int abc/s; ; //DOES NOT COMPILE
    int abc_sd;
    int abc$$a;


    //    Prepare to be tested on these rules. The following examples are legal:
    int okidentifier;
    int $OK2Identifier;
    int _alsoOK1d3ntifi3r;
    int __SStillOkbutKnotsonice$;

//    These examples are not legal:
    //int 3DPointClass  // identifiers cannot begin with a number
    // int hollywood@vine // @ is not a letter, digit, $ or _
    // int *$coffee // * is not a letter, digit, $ or _
    // int public   // public is a reserved word

}
