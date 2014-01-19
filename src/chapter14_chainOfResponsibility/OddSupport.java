package chapter14_chainOfResponsibility;

/**
 * Created with IntelliJ IDEA.
 * User: naohiro
 * Date: 2013/12/21
 * Time: 18:29
 * To change this template use File | Settings | File Templates.
 */
public class OddSupport extends Support {
    public OddSupport (String name) {
        super(name);
    }
    protected boolean resolve(Trouble trouble) {
        if (trouble.getNumber() % 2 == 1) {
            return true;
        } else {
            return false;
        }
    }

}
