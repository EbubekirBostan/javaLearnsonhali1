package Day04.Clarus_JavaPracticeFall.out.production.Clarus_JavaPracticeFall.day01;

public class Q07_StringManipulation {

    /*
     * girilen String icinde "xyz" dizimi var ise true degilse false return eden metod yaziniz
     *
     * input      output
     * axyzm  ==   true
     * xyz    ==   true
     * x.yz   ==   false
     * xyaz   ==   false
     */

    public static void main(String[] args) {
        String s = "xyaz";
        boolean xyzIceriyorMu = false;

        if(s.contains("xyz")){
            xyzIceriyorMu = true;
            System.out.println(xyzIceriyorMu);
        }else {
            xyzIceriyorMu=false;
            System.out.println(xyzIceriyorMu);
        }

    }




}
