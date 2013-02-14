package de.tutorials;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
 
/**
 * @author olgun.katrag - ferit.cubukcuoglu
 * 
 */
public class array {
    /**
     * @param args
     */
    public static void main(String[] args) throws Exception {
        File file = new File("/home/fecub/Dropbox/workspace_win/iotxt/Array/src/de/tutorials/test.txt");
        String test = method0(file);
        String[] values = test.split("\n");
        System.out.println(values[0]);
    }
 
    private static String method0(File file) throws Exception, IOException,
            UnsupportedEncodingException {
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] data = new byte[(int) file.length()];
        fileInputStream.read(data);
        fileInputStream.close();
        String strFileContent = new String(data, "UTF-8");
        return strFileContent;
    }
}