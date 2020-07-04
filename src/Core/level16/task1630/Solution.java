package Core.level16.task1630;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static String firstFileName;
    public static String secondFileName;

    //add your code here - добавьте код тут
    static {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            firstFileName = reader.readLine();
            secondFileName = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        //add your code here - добавьте код тут
        f.join();
        System.out.print(f.getFileContent());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }

    //add your code here - добавьте код тут
//    public static class ReadFileThread extends Thread implements ReadFileInterface {
//        @Override
//        public void run() {
//            try {
//                BufferedReader result = new BufferedReader(new InputStreamReader(System.in));
//
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//
//        @Override
//        public void setFileName(String fullFileName) {
//
//        }
//
//        @Override
//        public String getFileContent() {
//            return null;
//        }
//    }
    public static class ReadFileThread extends Thread implements ReadFileInterface {
        private String fileName;
        private String result = "";

        @Override
        public void setFileName(String fullFileName) {
            fileName = fullFileName;
        }

        @Override
        public String getFileContent() {
            return result;
        }

        @Override
        public void run() {
            try (BufferedReader fileReader = new BufferedReader(new FileReader(fileName))) {
                while (fileReader.ready()) {
                    result += fileReader.readLine() + " ";
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
//    C:\prog\ooop.txt
//    C:\prog\op.txt
}
