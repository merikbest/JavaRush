package Core.level18.task1820;

import java.io.*;

//        "C:\prog\first_nums.txt"
//        "C:\prog\second_nums.txt"

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
        String filename1 = reader.readLine();
        String filename2 = reader.readLine();

            try (BufferedReader file1 = new BufferedReader( new FileReader (filename1));
                 BufferedWriter writer = new BufferedWriter(new FileWriter(filename2));) {
                String num = file1.readLine();

                String[] nums = num.split(" ");

                for (int i = 0; i < nums.length; i++) {
                    writer.write(Math.round(Double.parseDouble(nums[i])) + " ");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}