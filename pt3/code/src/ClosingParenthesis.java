public class ClosingParenthesis extends Symbol {

    public ClosingParenthesis() {
        super(")");
    }

    @Override
    public String getOpeningCharacter() {
        return "(";
    }

}