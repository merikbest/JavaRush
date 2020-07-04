package Core.level18.task1817;

import java.io.FileInputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) {
//        "C:\\prog\\op.txt"


        try (FileInputStream fin = new FileInputStream("C:\\prog\\op.txt")){
            int i;
            int spaceCount = 0;
            int symbolCount = 0;

            while ((i = fin.read()) != -1) {
                symbolCount++;
                if ((char)i == ' ')
                    spaceCount++;
            }

            System.out.println("Spaces: " + spaceCount);
            System.out.println("Symbols: " + symbolCount);
            System.out.printf("Ratio: " + "%.2f", (double) symbolCount/spaceCount);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
