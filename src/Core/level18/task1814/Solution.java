package Core.level18.task1814;


import java.io.FileInputStream;
import java.io.IOException;

class UnsupportedFileNameException extends Exception {

}

class Solution extends FileInputStream {

    public Solution(String fileName) throws UnsupportedFileNameException, IOException {
        super(fileName);

        if (!(fileName.endsWith(".txt"))) {
            super.close();
            throw new UnsupportedFileNameException();
        }
    }

    public static void main(String[] args) {
    }
}


