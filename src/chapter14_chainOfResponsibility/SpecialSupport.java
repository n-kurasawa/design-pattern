package chapter14_chainOfResponsibility;

/**
 * Created with IntelliJ IDEA.
 * User: naohiro
 * Date: 2013/12/21
 * Time: 18:33
 * To change this template use File | Settings | File Templates.
 */
public class SpecialSupport extends Support {
    private int number;
    public SpecialSupport (String name, int number) {
        super(name);
        this.number = number;
    }
    protected boolean resolve(Trouble trouble) {
        if (trouble.getNumber() == number) {
            return true;
        } else {
            return false;
        }
    }
}
