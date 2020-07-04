package Core.level16.task1601;

public class Solution {
    public static void main(String[] args) {
        TestThread task = new TestThread();
        new Thread(task).start();
    }

    public static class TestThread implements Runnable {
        @Override
        public void run() {
            System.out.println("My first thread");
        }
    }
}

