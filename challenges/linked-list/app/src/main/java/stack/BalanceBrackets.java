package stack;

import java.util.ArrayList;
import java.util.Arrays;

public class BalanceBrackets {
    private Stack<String> stackBracket;

    public BalanceBrackets() {
        stackBracket = new Stack<>();
    }

    /**
     *
     * @param input : sentence of type String contains brackets to test their balance
     * @return boolean whether brackets are balanced or not
     */
    public boolean validateBracket(String input){
        ArrayList<String> list = new ArrayList<>(Arrays.asList(input.split("")));
        for (String character: list){
            if (character.equals("{") || character.equals("(") || character.equals("[")){
                stackBracket.push(character);
                continue;
            }
            switch (character) {
                case "}":
                    if (stackBracket.peek().equals("{")) {
                        stackBracket.pop();
                    }
                    break;
                case ")":
                    if (stackBracket.peek().equals("(")) {
                        stackBracket.pop();
                    }
                    break;
                case "]":
                    if (stackBracket.peek().equals("[")) {
                        stackBracket.pop();
                    }else return false;
                    break;
            }
            }
        return stackBracket.isEmpty();
    }
}
