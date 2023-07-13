package chapter1.objects;

public class InitializationOrder2 { //3
    public InitializationOrder2() { //6
        number = 5;
    }
    public static void main(String[] args) { //1
        InitializationOrder2 egg = new InitializationOrder2(); //2
        System.out.println(egg.number); //7
    }
    private int number = 3; //4
    { number = 4; } //5

}

