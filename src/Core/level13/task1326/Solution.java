package Core.level13.task1326;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
Сортировка четных чисел из файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код C:\prog\ooop.txt
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileReader = new BufferedReader(new InputStreamReader(new FileInputStream(reader.readLine())));

        List<Integer> lines = new ArrayList<Integer>();
        String line;
        int foo;

        while ((line = fileReader.readLine()) != null) {
            foo = Integer.parseInt(line);
            if (foo%2==0)
                lines.add(foo);
        }
        Collections.sort(lines);

        for (Integer i : lines) {
            System.out.println(i);
        }

        reader.close();
        fileReader.close();
    }
}
