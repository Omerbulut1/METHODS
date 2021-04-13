package STEP9_METHODS_Basic;
import java.util.Scanner;
import java.util.Random;
public class A5_METHODS_Sum_divide_multipy_extract {
    public static void main(String[] args) {
        double num1, num2, result;
        int factorial, secim;
        do {
            secim=secimMN();

            switch(secim){
                case 1: num1=numbersMN();
                        num2=numbersMN();
                        result=toplama(num1,num2);
                        sonucugoster(result);
                        break;
                case 2: num1=numbersMN();
                        num2=numbersMN();
                        result=cikarma(num1,num2);
                        sonucugoster(result);
                        break;
                case 3: num1=numbersMN();
                        num2=numbersMN();
                        result=carpma(num1,num2);
                        sonucugoster(result);
                        break;
                case 4: num1=numbersMN();
                        num2=numbersMN();
                        result=bolme(num1,num2);
                        sonucugoster(result);

            }


        } while (secim != 7);
    }

    public static void Menu() {
        System.out.println("secim yapiniz");
        System.out.println("1-SUM/n2-EXTRACTION/n3-MULTIPY/n4-DIVIDE");


    }

    public static int secimMN() {
        Menu();
        Scanner input = new Scanner(System.in);
        int secimFM;
        secimFM = input.nextInt();

        while (secimFM < 1 || secimFM > 4) {
            System.out.println("yenidenn secim yapiniz");
            secimFM = input.nextInt();
        }
        return secimFM;

    }
    public static double numbersMN(){
        Scanner input = new Scanner(System.in);
        Double num1FM;
        System.out.println("ondalik sayi giriniz");
        num1FM=input.nextDouble();
        return num1FM;
    }
    public static double toplama(double num5, double num6){
            double sonuc=num5+num6;
            return sonuc;
    }
    public static double cikarma(double num5, double num6){
        double sonuc=num5-num6;
        return sonuc;
}
    public static double carpma(double num5,double num6){
    double sonuc=num5*num6;
    return sonuc;
}
    public static double bolme(double num5,double num6) {
        double sonuc = num5 / num6;
        return sonuc;
    }
    public static void sonucugoster(double num8){
        System.out.println("islemin sonucu=" + num8);
    }
}