package Core.level14.task1408;

/*
Куриная фабрика
*/

public class Solution {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Country.BELARUS);
        hen.getCountOfEggsPerMonth();
    }

    static class HenFactory {

        static Hen getHen(String country) {
            Hen hen = null;
            //напишите тут ваш код
            switch (country) {
                case Country.RUSSIA:
                    hen = new RussianHen();
                    break;
                case Country.UKRAINE:
                    hen = new UkrainianHen();
                    break;
                case Country.MOLDOVA:
                    hen = new MoldovanHen();
                    break;
                case Country.BELARUS:
                    hen = new BelarusianHen();
            }
            return hen;
        }
    }
}

    interface Country {
        String UKRAINE = "Ukraine";
        String RUSSIA = "Russia";
        String MOLDOVA = "Moldova";
        String BELARUS = "Belarus";
    }


    abstract class Hen {
         abstract int getCountOfEggsPerMonth();

         String getDescription() {
            return "Я - курица.";
        }
    }

    class RussianHen extends Hen {
        @Override
        int getCountOfEggsPerMonth() {
            return 100;
        }

        @Override
        String getDescription() {
            return super.getDescription() + " Моя страна - " + Country.RUSSIA + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
        }
    }

    class UkrainianHen extends Hen {

        @Override
         int getCountOfEggsPerMonth() {
            return 150;
        }

        @Override
         String getDescription() {
            return super.getDescription() + " Моя страна - " + Country.UKRAINE + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
        }
    }

     class MoldovanHen extends Hen {

        @Override
         int getCountOfEggsPerMonth() {
            return 200;
        }

        @Override
         String getDescription() {
            return super.getDescription() + " Моя страна - " + Country.MOLDOVA + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
        }
    }

     class BelarusianHen extends Hen {

        @Override
         int getCountOfEggsPerMonth() {
            return 250;
        }

        @Override
         String getDescription() {
            return super.getDescription() + " Моя страна - " + Country.BELARUS + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
        }
    }

