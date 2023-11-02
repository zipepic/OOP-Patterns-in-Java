package behaviors.inclass.interpretator;

public class TerminalExpression implements AbstractExpression{
    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        return data.equals(context);
    }
}
