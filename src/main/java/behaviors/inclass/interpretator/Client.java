package behaviors.inclass.interpretator;

public class Client {
    public static void main(String[] args) {
        TerminalExpression terminalExpression = new TerminalExpression("Hello2");
        AbstractExpression expression = new NonterminalExpression(terminalExpression);
        System.out.println(expression.interpret("Hello2"));
    }
}
