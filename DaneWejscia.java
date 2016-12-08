package logiczny.test;

/**
 * Created by Stacjonarka on 2016-12-08.
 */
public class DaneWejscia {



    public void wykonaj() {
        Dane a=new Dane();
        Dane b=new Dane();
        TestLogiczny test = new TestLogiczny();
        //System.out.println(a.getName());
        a.odczytDane("A");
        b.odczytDane("B");
        test.rodzaj();
        System.out.println("  A  "+ "     B      "+ test.getRodzaje());
        System.out.println(a.getDane() + "    " + b.getDane()+ "    " +test.wykonajTest(a.getDane(), b.getDane(), test.getRodzaj()));

    }

}
