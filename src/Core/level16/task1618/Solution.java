package Core.level16.task1618;

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        //Add your code here - добавь код тут
        TestThread tt1 = new TestThread();
        tt1.start();
        tt1.interrupt();

    }

    //Add your code below - добавь код ниже
    public static class TestThread extends Thread {

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
