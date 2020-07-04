package Core.level18.task1812;

import java.io.*;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws Exception {
//        new Thread(new QuestionFileOutputStream()).start();

//        String line;
//
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//
//        while (!(line = reader.readLine()).equals("Д")) {
//            reader.close();
//        }
    }
}

interface AmigoOutputStream {
    void flush() throws IOException;

    void write(int b) throws IOException;

    void write(byte[] b) throws IOException;

    void write(byte[] b, int off, int len) throws IOException;

    void close() throws IOException;
}

class QuestionFileOutputStream implements AmigoOutputStream {
    private AmigoOutputStream component;

    public QuestionFileOutputStream(AmigoOutputStream component) {
        this.component = component;
    }

    @Override
    public void flush() throws IOException {
        component.flush();
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
        component.write(b,off,len);
    }

    @Override
    public void close() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Вы действительно хотите закрыть поток? Д/Н");

        if (reader.readLine().equals("Д")) {
            component.close();
        }
    }
}