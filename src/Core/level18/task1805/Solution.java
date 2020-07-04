package Core.level18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.List;
//C:\prog\ooop.txt

public class Solution {
    public static void main(String[] args) throws Exception {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            FileInputStream inputStream = new FileInputStream(reader.readLine())) {

            HashSet<Integer> set = new HashSet<>();

            while (inputStream.available() > 0) {
                set.add(inputStream.read());
            }

            List<Integer> list = new ArrayList<>(set);
            Collections.sort(list);

            for (Integer i : list) {
                System.out.print(i + " ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}