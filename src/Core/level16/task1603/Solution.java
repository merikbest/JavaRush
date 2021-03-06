package Core.level16.task1603;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static volatile List<Thread> list = new ArrayList<Thread>(5);

    public static void main(String[] args) {
        //Add your code here - добавьте свой код тут
//        SpecialThread st1 = new SpecialThread();
//        SpecialThread st2 = new SpecialThread();
//        SpecialThread st3 = new SpecialThread();
//        SpecialThread st4 = new SpecialThread();
//        SpecialThread st5 = new SpecialThread();
//
//        list.add(new Thread(st1));
//        list.add(new Thread(st2));
//        list.add(new Thread(st3));
//        list.add(new Thread(st4));
//        list.add(new Thread(st5));

        for (int i = 0; i < 5; i++) {
            list.add(new Thread(new SpecialThread()));
        }
    }

    public static class SpecialThread implements Runnable {
        public void run() {
            System.out.println("it's a run method inside SpecialThread");
        }
    }
}
