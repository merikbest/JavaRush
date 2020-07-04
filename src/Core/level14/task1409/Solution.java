package Core.level14.task1409;

public class Solution {
    public static void main(String[] args) {
        println(new WaterBridge());
        println(new SuspensionBridge());
    }

    //add println method here
    public static void println(Bridge bridge) {
        System.out.println(bridge.getCarsCount());
    }
}

interface Bridge {
    int getCarsCount();
}

class WaterBridge implements Bridge {

    @Override
    public int getCarsCount() {
        return 10;
    }
}

class SuspensionBridge implements Bridge {

    @Override
    public int getCarsCount() {
        return 20;
    }
}
