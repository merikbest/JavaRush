package Core.level18.task1821;

import java.io.*;
import java.util.Map;
import java.util.TreeMap;


//BufferedReader reader = new BufferedReader( new FileReader("C:\\prog\\first_file.txt"))


public class Solution {
    public static void main(String[] args) {
        try(FileInputStream f = new FileInputStream(args[0]);) {
            TreeMap<Byte, Integer> treeMap = new TreeMap<Byte, Integer>();

            while (f.available() > 0) {
                byte[] buf = new byte[f.available()];
                f.read(buf);

                for (int i = 0; i < buf.length; i++) {
                    if (treeMap.containsKey(buf[i]))
                        treeMap.put(buf[i], treeMap.get(buf[i]) + 1);
                    else
                        treeMap.put(buf[i], 1);
                }
            }

            for (Map.Entry pair : treeMap.entrySet()) {
                System.out.println((char)((byte) pair.getKey()) + " " + pair.getValue());
            }
//
//            int[] chars = new int[inputStream.available()];
//            while (inputStream.available() > 0) {
//                chars[inputStream.read()]++;
//            }
//
//            Map<Character, Integer> treeMap = new TreeMap<Character, Integer>();
//
//            for (int i = 0; i < chars.length; i++) {
//                treeMap.put((char)i, chars[i]);
//
////                if (chars[i] > 0) {
////                    System.out.println((char) i + ": " + chars[i]);
////                }
//            }
//
//            for (Map.Entry<Character, Integer> entry : treeMap.entrySet()) {
//                System.out.println(entry.getKey() + ": " + entry.getValue());
//            }

//            char[] abc = "abcdefghijklmnopqrstuvwxyz".toCharArray();
//
//            ArrayList<Character> alphabet = new ArrayList<Character>();
//            for (int i = 0; i < abc.length; i++) {
//                alphabet.add(abc[i]);
//            }
//
//            String line;
//
//            ArrayList<String> file = new ArrayList<String>();
//            while ((line = reader.readLine()) != null) {
//                file.add(line);
//            }
//
//            int count = 0;
//
//            for (int i = 0; i < alphabet.size(); i++) {
//                for (int j = 0; j < file.size(); j++) {
//                    for (int k = 0; k < file.get(j).length(); k++) {
//                        if (alphabet.get(i).equals(file.get(j).charAt(k)))
//                            count++;
//                    }
//                }
//                System.out.println(alphabet.get(i) + " " + count);
//                count = 0;
//            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}