package Core.level18.task1813;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Solution extends FileOutputStream {
    public static String fileName = "C:/tmp/result.txt";
    private FileOutputStream component;

    public Solution(FileOutputStream component) throws FileNotFoundException {
        super(fileName);
        this.component = component;
    }

    public static void main(String[] args) throws FileNotFoundException {
        new Solution(new FileOutputStream(fileName));
    }

    @Override
    public void write(int b) throws IOException {
        component.write(b);
    }

    @Override
    public void write(byte[] b) throws IOException {
        component.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        component.write(b, off, len);
    }

    @Override
    public void close() throws IOException {
        component.flush();
        component.write("JavaRush © All rights reserved.".getBytes());
        component.close();
    }

    @Override
    public void flush() throws IOException {
        component.flush();
    }
}