package _06_Project_Get_Tag_WebPage.test;

import _06_Project_Get_Tag_WebPage.gvideo.model.Storage;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class StorageTest {

    public static void main(String[] args) throws Exception {

        Storage test = new Storage();

        boolean loaded = test.load(new FileInputStream("C:/MyFiles/storage.txt"));
        System.out.println(test);
        System.out.println(loaded);

        test.storeString("1", "بسم الله الرحمن الرحيم");
        test.storeString("2", "Majd Talji");
        test.storeString("3", "Majd & Alaa");

        // ./storage.txt
        test.store(new FileOutputStream("C:/MyFiles/storage.txt"));
        System.out.println(test);

    }

}
