package chapter23_interpreter;

/**
 * Created by naohiro on 2014/01/03.
 */
public abstract class Node {
    public abstract void parse(Context context) throws ParseException;
}
