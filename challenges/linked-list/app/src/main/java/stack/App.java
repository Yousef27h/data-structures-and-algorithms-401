package stack;



public class App {
    public static void main(String[] args) {
//        Stack stack = new Stack();

//        stack.push(3);
//        stack.push(4);

//        System.out.println(stack.listString());
//        System.out.println(stack.getTop().getValue());
//        System.out.println(stack.pop());
//        System.out.println(stack.listString());
//        System.out.println(stack.peek());
//        System.out.println(stack.isEmpty());


//        System.out.println();
//        System.out.println(balanceBrackets.validateBracket("(){}[[]]"));
//        System.out.println(balanceBrackets.validateBracket("{}{Code}[Fellows](())"));
//        System.out.println(balanceBrackets.validateBracket("[({}]"));
//        System.out.println(balanceBrackets.validateBracket("(]("));
//        System.out.println(balanceBrackets.validateBracket("{(})"));
//        System.out.println(balanceBrackets.validateBracket("[}"));
        MaxStack maxStack = new MaxStack(1);
        maxStack.push(3);
        maxStack.push(2);
        maxStack.push(1);
        maxStack.push(0);
        System.out.println(maxStack.getMax());
    }


}
