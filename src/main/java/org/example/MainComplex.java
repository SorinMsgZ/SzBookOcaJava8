package org.example;

import appendix.AppendixBStudyTipps;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class MainComplex {
    public static void main(String[] args) {
        // Press Alt+Eingabe with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        // Press Umschalt+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Umschalt+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Strg+F8.
            System.out.println("i = " + i);
        }

        //Test Appendix B
        AppendixBStudyTipps appB = new AppendixBStudyTipps();
        System.out.println("Test Appendix B:");
        appB.testOperation();

        //Test a class which contains 2 classes
        /*ClassVsFile classVsFile = new ClassVsFile();
        classVsFile.doPublicFirstClass();*/
        //classVsFile.doNotPublicSecondClass; --> it has no access to this class

        //Animal2 animal2 = new Animal2(); --> it has no access to this class and from this package because it is not public
    }
}