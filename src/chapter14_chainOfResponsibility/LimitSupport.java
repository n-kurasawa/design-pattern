package chapter14_chainOfResponsibility;

/**
 * Created with IntelliJ IDEA.
 * User: naohiro
 * Date: 2013/12/21
 * Time: 18:22
 * To change this template use File | Settings | File Templates.
 */
public class LimitSupport extends Support {
    private int limit;
    public LimitSupport(String name, int limit) {
        super(name);
        this.limit = limit;
    }
    @Override
    protected boolean resolve(Trouble trouble) {
        if (trouble.getNumber() < limit) {
            return true;
        } else {
            return false;
        }
    }
}
