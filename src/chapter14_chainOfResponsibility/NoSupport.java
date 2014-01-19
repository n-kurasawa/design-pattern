package chapter14_chainOfResponsibility;

/**
 * Created with IntelliJ IDEA.
 * User: naohiro
 * Date: 2013/12/21
 * Time: 18:18
 * To change this template use File | Settings | File Templates.
 */
public class NoSupport extends Support {
    public NoSupport(String name) {
        super(name);
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        return false;
    }
}
