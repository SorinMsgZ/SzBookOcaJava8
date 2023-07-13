package chapter1.packages;

public class RunViaCmd {

    //run from the default package (e.g. 'java' or 'temp' - folder/package)
    //use cd command to jump to the default folder
    //javac chapter1/packages/RunViaCmd.java
    //java chapter1/packages/RunViaCmd

    //TODO
    //this seems not to work
    //java -cp ".;C:\temp\someOtherLocation;c:\temp\myJar.jar" myPackage.MyClass
    //java -cp "C:\temp\directoryWithJars\*" myPackage.MyClass

    public static void main(String[] args) {
        System.out.println("Works also from cmd prompt! ");
    }
}
