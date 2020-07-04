package Core.level13.task1326;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SolutionV2 {
    public static void main(String[] args) throws Exception {
        FileReader fileReader = new FileReader("C:\\prog\\ooop.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        List<Integer> lines = new ArrayList<Integer>();
        String line;
        int foo;

        while ((line = bufferedReader.readLine()) != null) {
            foo = Integer.parseInt(line);
            if (foo%2==0)
            lines.add(foo);
        }

        Collections.sort(lines);
        System.out.println(lines);

        bufferedReader.close();
    }
}
