package Core.level15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        //add your code here
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String str = reader.readLine();

//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) == '?' && str.charAt(i+1) != '&') {
//                System.out.println(str.charAt(i+1));
//            }
//        }
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            List<String> values = new LinkedList<>();
            for (String line : reader.readLine().split("\\?")[1].split("&")) {
                String[] splitParams = line.split("=");
                if (splitParams[0].equals("obj")) {
                    values.add(splitParams[1]);
                }
                System.out.print(splitParams[0] + " ");
            }
            System.out.println();

            for (String value : values) {
                try {
                    alert(Double.parseDouble(value));
                } catch (NumberFormatException e) {
                    alert(value);
                }
            }

            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
