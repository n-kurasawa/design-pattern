package chapter17_observer;

/**
 * Created by naohiro on 2013/12/29.
 */
public class DigitObserver implements Observer {
    public void update(NumberGenerator generator) {
        System.out.println("DigitObserver:" + generator.getNumber());
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            //
        }
    }
}
