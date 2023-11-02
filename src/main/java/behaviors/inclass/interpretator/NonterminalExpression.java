package behaviors.inclass.interpretator;

public class NonterminalExpression implements AbstractExpression{
    TerminalExpression terminalExpression;

    public NonterminalExpression(TerminalExpression terminalExpression) {
        this.terminalExpression = terminalExpression;
    }

    @Override
    public boolean interpret(String context) {
        return terminalExpression.interpret(context);
    }
}
