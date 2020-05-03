package _06_Project_Get_Tag_WebPage.gvideo.model;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Storage {

    private Map<String, String> base = new HashMap<>();

    public void storeString(String key, String value) {
        assert !key.contains("\n");
        assert !value.contains("\n");
        base.put(key, value);
    }

    public String getString(String key) {
        return base.get(key);
    }

    public void store(OutputStream goal) throws Exception {
        PrintStream wrapped = new PrintStream(goal);

        for (String key : base.keySet()) {
            String value = base.get(key);
            wrapped.println(key);
            wrapped.println(value);
        }

        wrapped.close();
        goal.flush();
    }

    public boolean load(InputStream source) {
        try {
            Scanner scanner = new Scanner(source);
            while (scanner.hasNextLine()) {
                String key = scanner.nextLine();
                String value = scanner.nextLine();
                base.put(key, value);
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public String toString() {
        return base + "";
    }

}
