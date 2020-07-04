package Core.level15.task1522;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
        public static void main(String[] args)  {

        }

        public static Planet thePlanet;

        //add static block here - добавьте статический блок тут
        static {
            readKeyFromConsoleAndInitPlanet();
        }

        public static void readKeyFromConsoleAndInitPlanet() {
            // implement step #5 here - реализуйте задание №5 тут
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            try {
                String str = reader.readLine();

                if (str.equals(Sun.SUN)) {
                    thePlanet = Sun.getInstance();
                } else if (str.equals(Moon.MOON)) {
                    thePlanet = Moon.getInstance();
                } else if (str.equals(Earth.EARTH)) {
                    thePlanet = Earth.getInstance();
                } else
                    thePlanet = null;

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
}

interface Planet {
    static String SUN = "sun";
    static String MOON = "moon";
    static String EARTH = "earth";
}

//SINGLETON
class Sun implements Planet {
    private static Sun instance;
    private Sun(){};

    public static Sun getInstance() {
        if (instance == null) {
            instance = new Sun();
        }
        return instance;
    }
}

//SINGLETON
class Moon implements Planet {
    private static Moon instance;
    private Moon(){};

    public static Moon getInstance() {
        if (instance == null) {
            instance = new Moon();
        }
        return instance;
    }
}

//SINGLETON
class Earth implements Planet {
    private static Earth instance;
    private Earth(){};

    public static Earth getInstance() {
        if (instance == null) {
            instance = new Earth();
        }
        return instance;
    }
}