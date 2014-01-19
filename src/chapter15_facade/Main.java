package chapter15_facade;

import chapter15_facade.pagemaker.PageMaker;

/**
 * Created with IntelliJ IDEA.
 * User: naohiro
 * Date: 2013/12/22
 * Time: 0:32
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public static void main(String[] args) {
        PageMaker.makeWelcomePage("hyuki@hyuki.com", "welcome.html");
    }
}
