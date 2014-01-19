package chapter13_visitor;

/**
 * Created with IntelliJ IDEA.
 * User: naohiro
 * Date: 2013/11/24
 * Time: 17:55
 * To change this template use File | Settings | File Templates.
 */
public class FileTreatmentException extends RuntimeException {
    public FileTreatmentException() {
    }
    public FileTreatmentException(String msg) {
        super(msg);
    }
}
