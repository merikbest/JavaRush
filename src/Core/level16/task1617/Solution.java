package Core.level16.task1617;

public class Solution {
    public static volatile int numSeconds = 4;

    public static void main(String[] args) throws InterruptedException {
        RacingClock clock = new RacingClock();
        //add your code here - добавь код тут
        Thread.sleep(3500);
        clock.interrupt();
    }

    public static class RacingClock extends Thread {
        public RacingClock() {
            start();
        }

        public void run() {
            //add your code here - добавь код тут
//            if (numSeconds <= 3) {
//                for (int i = numSeconds; i >= 0; i--) {
//                    if (i == 0) {
//                        System.out.print("Марш!");
//                    } else
//                        System.out.print(i + " ");
//                    try {
//                        Thread.sleep(1000);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//            } else
//                for (int i = numSeconds; i >= 0; i--) {
//                    if (i == 0) {
//                        System.out.print("Прервано!");
//                    } else
//                        System.out.print(i + " ");
//                    try {
//                        Thread.sleep(1000);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
            while (numSeconds > 0 || isInterrupted()) {
                try {
                    System.out.print(numSeconds-- + " ");
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Прервано!");
                    return;
                }
            }
            System.out.println("Марш!");
        }
    }
}
