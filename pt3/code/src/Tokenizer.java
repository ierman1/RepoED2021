import java.util.ArrayList;
import java.util.Stack;

public class Tokenizer {

    public static boolean checkExpression(ArrayList<Symbol> symbols) {
        Stack<Symbol> queue = new Stack<>();

        for (Symbol s : symbols) {
            if (queue.empty() || s.getOpeningCharacter() == null || s.getOpeningCharacter() != queue.peek().toString()) {
                queue.push(s);
            } else {
                queue.pop();
            }
        }

        return queue.empty();
    }

}
