package Core.level16.task1619;

public class Solution {
//    public static boolean isRunning = true;

    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new TestThread());
        t.start();
        Thread.sleep(3000);
        ourInterruptMethod();
    }

    public static void ourInterruptMethod() {
//        isRunning = false;
        TestThread.isRunning = false;
    }

    public static class TestThread implements Runnable {
        public static boolean isRunning = true;

        public void run() {
            while (isRunning) {
                try {
                    System.out.println("he-he");
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                }
            }
        }
    }
}
