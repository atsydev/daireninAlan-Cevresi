package Uygulamalar;

import java.util.Scanner;

public class DaireninAlanCevre {
    public static void main(String[] args) {

        double yaricap, cevre, alan, pi=3.14;

        Scanner scan=new Scanner(System.in);
        System.out.println("Dairenin yarıçapını giriniz");
        yaricap= scan.nextDouble();
        cevre=2*pi*yaricap;
        alan=pi*yaricap*yaricap;
        System.out.println("Dairenin alanı: "+ alan);
        System.out.println("Dairenin çevresi: "+ cevre);

    }
}
