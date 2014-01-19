package chapter23_interpreter;

/**
 * Created by naohiro on 2014/01/03.
 */
public class CommandNode extends Node {
    private Node node;
    public void parse(Context context) throws ParseException {
        if(context.currentToken().equals("repeat")) {
            node = new RepeatCommandNode();
            node.parse(context);
        } else {
            node = new PrimitiveCommandNode();
            node.parse(context);
        }
    }
    public String toString() {
        return node.toString();
    }
}
