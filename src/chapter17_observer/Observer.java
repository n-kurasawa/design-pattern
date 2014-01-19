package chapter17_observer;

/**
 * Created with IntelliJ IDEA.
 * User: naohiro
 * Date: 2013/12/22
 * Time: 13:10
 * To change this template use File | Settings | File Templates.
 */
public interface Observer {
    public abstract void update(NumberGenerator generator);
}
