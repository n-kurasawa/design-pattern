package chapter20_flyweight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by naohiro on 2014/01/01.
 */
public class BigChar {
    private char charname;
    private String fontdata;
    public BigChar(char charname) {
        this.charname = charname;
        try {
            BufferedReader reader = new BufferedReader(new FileReader("big" + charname + ".txt"));
            String line;
            StringBuilder sb = new StringBuilder();
            while((line = reader.readLine()) != null) {
                sb.append(line);
                sb.append("\n");
                reader.close();
                this.fontdata = sb.toString();
            }

        } catch (IOException e) {
            this.fontdata = charname + "?";
        }
    }
    public void print() {
        System.out.println(fontdata);
    }
}