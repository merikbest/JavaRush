package Core.level17.task1707;

public class Solution {
    public static void main(String[] args) {
        IMF fund = IMF.getFund();
        IMF anotherFund = IMF.getFund();
        System.out.println(fund == anotherFund );
    }
}

class IMF {

    private static IMF imf;

    public static IMF getFund() {
        //add your code here - добавь код тут
        synchronized (IMF.class) {
            if (imf == null) {
                imf = new IMF();
            }
        }
        return imf;
    }

    private IMF() {
    }
}
