package chapter11_composite;

public class Main {

	public static void main(String[] args) {
		try {
			System.out.println("Making root entries...");
			Directory rootdir = new Directory("root");
			Directory bindir = new Directory("bin");
			Directory tmpdir = new Directory("tmp");
			Directory usedir = new Directory("usr");
			rootdir.add(bindir);
			rootdir.add(tmpdir);
			rootdir.add(usedir);
			bindir.add(new File("vi", 10000));
			bindir.add(new File("latex", 20000));
			rootdir.printList();

			System.out.println("");
			System.out.println("Making user entries...");
			Directory yuki = new Directory("yuki");
			Directory hanako = new Directory("hanako");
			Directory tomura = new Directory("tomura");
			usedir.add(yuki);
			usedir.add(hanako);
			usedir.add(tomura);
			yuki.add(new File("diary.html", 100));
			yuki.add(new File("Compsite.java", 200));
			hanako.add(new File("memo.tex", 300));
			hanako.add(new File("game.doc", 400));
			tomura.add(new File("junk.mail", 500));
			rootdir.printList();

			System.out.println("");
			System.out.println(tomura.getFullName());
		} catch (FileTreatmentException e) {
			e.printStackTrace();
		}
	}
}
