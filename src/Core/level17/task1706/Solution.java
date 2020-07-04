package Core.level17.task1706;

public class Solution {
    public static void main(String[] args) {
        OurPresident expectedPresident = OurPresident.getOurPresident();
        OurPresident ourPresident = OurPresident.getOurPresident();
        System.out.println(expectedPresident == ourPresident );
    }
}

class OurPresident {
    private static OurPresident president;

    private OurPresident() {

    }

    static {
        synchronized (OurPresident.class){
            president = new OurPresident();
        }
    }

    public static OurPresident getOurPresident() {
        return president;
    }
}
