package Core.level19.task1905;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        String str = "Ivanov, Ivan";
        String number = "asd38(050)123-45-67";
        String rand = "12 text var2 14 8ю 1";

        String name = str.substring(str.lastIndexOf(' ')+1);
        String lastName = str.substring(0,str.indexOf(','));
        String phoneNum = number.replaceAll("[^\\w]", "");


        String [] line = rand.split(" ");
        System.out.println(Arrays.toString(line));


            for (String x : line) {
                try {
                    System.out.println(Integer.parseInt(x));
                }catch (Exception e) {
                    System.out.println("error");
                }
            }
        }

        //   .replaceAll("[()-]","")

//        String s = "буквы,символы,цифры и тд и тп";
//        s = number.replaceAll("[^A-Za-zА-Яа-я0-9]", "");


}

