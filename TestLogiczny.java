package logiczny.test;

import java.util.Scanner;

/**
 * Created by Stacjonarka on 2016-12-08.
 */
public class TestLogiczny {

int x=10;
String opcja;


    String[] nazwyRodzaje =new String[4];{
        nazwyRodzaje[0]="AND";
        nazwyRodzaje[1]="OR";
        nazwyRodzaje[2]="NAND";
        nazwyRodzaje[3]="NAND";
    }

    public void rodzaj() {
        System.out.println("Wybierz rodzaj testu logicznego");
        System.out.println("1: AND");
        System.out.println("2: OR");
        System.out.println("3: NAND");
        System.out.println("4: NOR");
        Scanner odczyt = new Scanner(System.in);
       while (x==10){
            opcja=odczyt.nextLine();
            if (opcja.equals("1")){
                x = 0;
                break;
            }else if (opcja.equals("2")) {
                x = 1;
                break;
            }else if (opcja.equals("3")) {
                x = 2;
                break;
            }else if (opcja.equals("4")) {
                x = 3;
                break;
            }else {
                System.out.println("Nieprawidłowy wybór");
            }
       }
    }
    public int getRodzaj() {

        return x;

    }
    public String getRodzaje() {

        return nazwyRodzaje[getRodzaj()];

    }
    public boolean wykonajTest(boolean a , boolean b, int z){
        boolean dupa=false;
        if (z==0){
            if (a==b){dupa= true;}else{dupa= false;}
        }else if (z==1){
            if (a==false&&b==false){dupa= false;} else{dupa= true;}
        }else if (z==2){
            if (a!=b){dupa= true;} else {dupa= false;}
        }else if (z==3){
            if (a==false&&b==false){dupa= true;} else{return false;}
        }
        return dupa;
    }

}
