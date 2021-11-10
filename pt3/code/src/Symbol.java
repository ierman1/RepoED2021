public abstract class Symbol {

    private String character;

    protected Symbol(String character) {
        this.character = character;
    }

    public String getCharacter() {
        return character;
    }

    public abstract String getOpeningCharacter();

    @Override
    public String toString() {
        return character;
    }

}