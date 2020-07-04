package Core.level15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {

    }

    static {
        //add your code here - добавьте код тут
        reset();
    }

    public static CanFly result;

    public static void reset() {
        //add your code here - добавьте код тут
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
//            String str = reader.readLine();

            if (reader.readLine().equals("plane")) {
                result = new Plane(Integer.parseInt(reader.readLine()));
            } else if (reader.readLine().equals("helicopter")) {
                result = new Helicopter();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

interface CanFly {
    void fly();
}

class Plane implements CanFly {
    int passangers;

    public Plane(int p) {
        passangers = p;
    }

    @Override
    public void fly() {

    }
}

class Helicopter implements CanFly {

    @Override
    public void fly() {

    }
}