package logiczny.test;

import java.util.Scanner;

/**
 * Created by Stacjonarka on 2016-12-08.
 */
public class Dane {
    String cos;
    boolean dana;
    int i = 0;


    public void odczytDane(String nazwa) {
        System.out.println("Podaj wartość logiczną "+nazwa);
        while (i==0) {
            Scanner odczyt = new Scanner(System.in);
            cos = odczyt.nextLine();
            //dana=true;
            if (cos.toLowerCase().equals("true") || cos.toLowerCase().equals("t")) {
                dana = true;
                break;
            } else if (cos.toLowerCase().equals("false") || cos.toLowerCase().equals("f")) {
                dana = false;
                break;
            } else {
                System.out.println("Podaj wartość true albo false");
            }

        }
    }


    public boolean getDane() {

        return dana;

    }

}
