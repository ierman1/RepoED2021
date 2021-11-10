import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        ArrayList<Symbol> test = new ArrayList<>(Arrays.asList(
          new OpeningBraces(),
          new OpeningParenthesis(),
          new ClosingParenthesis(),
          new ClosingBraces()
        ));

        System.out.println(Tokenizer.checkExpression(test));

        test = new ArrayList<>(Arrays.asList(
                new OpeningBraces(),
                new OpeningParenthesis(),
                new ClosingBraces()
        ));

        System.out.println(Tokenizer.checkExpression(test));

        test = new ArrayList<>(Arrays.asList(
                new OpeningBraces(),
                new OpeningParenthesis(),
                new OpeningParenthesis(),
                new OpeningParenthesis(),
                new OpeningParenthesis(),
                new ClosingBraces()
        ));

        System.out.println(Tokenizer.checkExpression(test));

        test = new ArrayList<>(Arrays.asList(
                new OpeningBraces(),
                new OpeningParenthesis(),
                new OpeningBraces(),
                new OpeningParenthesis(),
                new OpeningParenthesis(),
                new OpeningParenthesis(),
                new OpeningParenthesis(),
                new ClosingParenthesis(),
                new ClosingParenthesis(),
                new ClosingParenthesis(),
                new ClosingParenthesis(),
                new ClosingBraces(),
                new ClosingParenthesis(),
                new ClosingBraces()
        ));

        System.out.println(Tokenizer.checkExpression(test));

        test = new ArrayList<>(Arrays.asList(
                new OpeningBraces(),
                new OpeningParenthesis(),
                new OpeningBraces(),
                new OpeningParenthesis(),
                new OpeningParenthesis(),
                new OpeningParenthesis(),
                new OpeningParenthesis(),
                new ClosingParenthesis(),
                new ClosingParenthesis(),
                new ClosingParenthesis(),
                new ClosingBraces(),
                new ClosingParenthesis(),
                new ClosingBraces()
        ));

        System.out.println(Tokenizer.checkExpression(test));

        test = new ArrayList<>(Arrays.asList(
                new ClosingBraces()
        ));

        System.out.println(Tokenizer.checkExpression(test));

        test = new ArrayList<>(Arrays.asList(
                new ClosingBraces(),
                new OpeningBraces(),
                new ClosingBraces()
        ));

        System.out.println(Tokenizer.checkExpression(test));

    }
}
