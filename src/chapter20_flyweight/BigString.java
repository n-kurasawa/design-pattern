package chapter20_flyweight;

/**
 * Created by naohiro on 2014/01/01.
 */
public class BigString {
    private BigChar[] bigchars;
    public BigString(String string) {
        bigchars = new BigChar[string.length()];
        BigCharFactory factory = BigCharFactory.getInstance();
        for(int i = 0; i < bigchars.length; i++) {
            bigchars[i] = factory.getBigChar(string.charAt(i));
        }
    }

    public void print() {
        for(int i = 0; i < bigchars.length; i++) {
            bigchars[i].print();
        }
    }
}
