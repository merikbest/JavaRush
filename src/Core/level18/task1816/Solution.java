package Core.level18.task1816;

import java.io.FileInputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException  {
//        args = new String[]{"C:\\prog\\ooop.txt"};

        try (FileInputStream fis = new FileInputStream(args[0])) {
            int symbol;
            int count = 0;

            while((symbol=fis.read())!= -1){
                if ((symbol >= 'a' && symbol <= 'z') || (symbol >= 'A' && symbol <= 'Z'))
                    count++;
            }
            System.out.println(count);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}