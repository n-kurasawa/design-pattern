package chapter23_interpreter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by naohiro on 2014/01/03.
 */
public class CommandListNode extends Node {
    private List<Node> list = new ArrayList<Node>();
    public void parse(Context context) throws ParseException {
        while (true) {
            if (context.currentToken() == null) {
                throw new ParseException("Missing 'end'");
            } else if (context.currentToken().equals("end")) {
                context.skipToken("end");
                break;
            } else {
                Node commandNode = new CommandNode();
                commandNode.parse(context);
                list.add(commandNode);
            }
        }
    }
    public String toString() {
        return list.toString();
    }
}
