

package de.tutorials;
 
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
 
/**
 * @author thomas.darimont
 * 
 */
public class array {
 
    /**
     * @param args
     */
    public static void main(String[] args) throws Exception {
        File file = new File("c:\\test.txt");
        method0(file);
        method1(file);
    }
 
    private static void method0(File file) throws Exception, IOException,
            UnsupportedEncodingException {
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] data = new byte[(int) file.length()];
        fileInputStream.read(data);
        fileInputStream.close();
        System.out.println(new String(data, "UTF-8"));
    }
 
    private static void method1(File file) throws Exception {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
 
        byte[] buffer = new byte[16384];
 
        for (int len = fileInputStream.read(buffer); len > 0; len = fileInputStream
                .read(buffer)) {
            byteArrayOutputStream.write(buffer, 0, len);
        }
 
        fileInputStream.close();
 
        System.out.println(new String(byteArrayOutputStream.toByteArray(),    "UTF-8"));
    }
    // bana gaymis
 
}