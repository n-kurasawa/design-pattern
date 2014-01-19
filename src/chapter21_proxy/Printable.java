package chapter21_proxy;

/**
 * Created by naohiro on 2014/01/02.
 */
public interface Printable {
    public abstract void setPrinterName(String name);
    public abstract String getPrinterName();
    public abstract void print(String string);
}
