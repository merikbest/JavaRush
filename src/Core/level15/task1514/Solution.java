package Core.level15.task1514;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();
    static {
        labels.put(1.1, "asd1");
        labels.put(1.2, "asd2");
        labels.put(1.3, "asd3");
        labels.put(1.4, "asd4");
        labels.put(1.5, "asd5");
    }

    public static void main(String[] args) {

        System.out.println(labels);
    }
}
