package _a_chapter1._h_variable_scope;

public class VariableScope {

    public void eat(int piecesOfCheese ) {//"piecesOfCheese" is a method parameter -> this is a local variable
        int bitesOfCheese = 1; //-> this is a local variable
    }

    public void eatIfHungry(boolean hungry) {
        if (hungry) {
            int bitesOfCheese = 1;
            {
                boolean teenyBit = true;
                System.out.println(bitesOfCheese);
            }
        }
        //System.out.println(teenyBit);  // DOES NOT COMPILE
    }
}
