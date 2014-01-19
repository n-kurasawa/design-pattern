package chapter9_Bridge;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * ファイルの内容を表示する
 * 実装の階層
 * @author naohiro
 *
 */
public class FileDisplayImpl extends DisplayImple {
	private String filename;
	private BufferedReader reader;
	private final int MAX_READHEAD_LIMIT = 4096;
	public FileDisplayImpl(String filename) {
		this.filename = filename;
	}

	@Override
	public void rawOpen() {
		try {
			reader = new BufferedReader(new FileReader(filename));
			reader.mark(MAX_READHEAD_LIMIT);
		} catch ( IOException e) {
			e.printStackTrace();
		}
		System.out.println("-------------" + filename + "--------------");
	}

	@Override
	public void rawPrint() {
		try {
			String line;
			reader.reset();
			while ((line = reader.readLine()) != null) {
				System.out.println("> " + line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void rawClose() {
		System.out.println("--------------------------------------------");
		try {
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
