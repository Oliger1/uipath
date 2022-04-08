package behavioral.interpreter;

public class TerminalNumber implements Expression {
    private int terminalNumber;

    public TerminalNumber(int number) {
        this.terminalNumber = number;
    }

    @Override
    public int interpret() {
        return terminalNumber;
    }
}
