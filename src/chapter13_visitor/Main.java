package chapter13_visitor;

/**
 * Created with IntelliJ IDEA.
 * User: naohiro
 * Date: 2013/11/24
 * Time: 17:59
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Making root entries...");
        Directory rootdir = new Directory("root");
        Directory bindir = new Directory("bin");
        Directory tmpdir = new Directory("tmp");
        Directory usrdir = new Directory("usr");
        rootdir.add(bindir);
        rootdir.add(tmpdir);
        rootdir.add(usrdir);
        bindir.add(new File("vi", 10000));
        bindir.add(new File("latex", 20000));
        rootdir.accept(new ListVisitor());

        System.out.println("");
        System.out.println("Making user entries...");
        Directory yuki = new Directory("yuki");
        Directory hanako = new Directory("hanako");
        Directory tomura = new Directory("tomura");
        usrdir.add(yuki);
        usrdir.add(hanako);
        usrdir.add(tomura);
        yuki.add(new File("diary.html", 100));
        yuki.add(new File("Composite.java", 200));
        hanako.add(new File("memo.txt", 300));
        tomura.add(new File("game.doc", 400));
        tomura.add(new File("junk.mail", 500));
        rootdir.accept(new ListVisitor());
    }
}
