public class ClosingBraces extends Symbol {

    public ClosingBraces() {
        super("}");
    }

    @Override
    public String getOpeningCharacter() {
        return "{";
    }

}