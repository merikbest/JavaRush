package Core.level17.task1721;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();
    public static String file1;
    public static String file2;

//C:\prog\ooop.txt
//C:\prog\op.txt

    public static void main(String[] args) {
        try(BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in))) {
            file1 = reader1.readLine();
            file2 = reader1.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader reader2 = new BufferedReader(new FileReader(file1));
             BufferedReader reader3 = new BufferedReader(new FileReader(file2));) {

            String line1;
            String line2;

            while ((line1 = reader2.readLine()) != null) {
                allLines.add(line1);
            }

            while ((line2 = reader3.readLine()) != null) {
                forRemoveLines.add(line2);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            new Solution().joinData();
        } catch (CorruptedDataException e) {
            e.printStackTrace();
        }
    }

    public void joinData() throws CorruptedDataException {
        if (allLines.containsAll(forRemoveLines)) {
            allLines.removeAll(forRemoveLines);
        } else
            allLines.clear();
        throw new CorruptedDataException();
    }
}

class CorruptedDataException extends IOException {
}
