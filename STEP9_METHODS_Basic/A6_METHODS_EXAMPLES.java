package STEP9_METHODS_Basic;
import java.util.Random;
import java.util.Scanner;
public class A6_METHODS_EXAMPLES {
    public static void main(String[] args) {
            int factorial,secim,random;
            double num1, num2, result;


            do {
                secim=secimMN();
                switch(secim) {
                    case 1:
                        num1=takeValueMN();
                        num2=takeValueMN();
                        result=sumMN(num1,num2);
                        showResult(result);
                        break;
                    case 2:
                        num1=takeValueMN();
                        num2=takeValueMN();
                        result=extractionMN(num1,num2);
                        showResult(result);
                        break;
                    case 3:
                        num1=takeValueMN();
                        num2=takeValueMN();
                        result=divideMN(num1,num2);
                        showResult(result);
                        break;
                    case 4:
                        num1=takeValueMN();
                        num2=takeValueMN();
                        result=multpyMN(num1,num2);
                        showResult(result);
                        break;
                    case 5:
                        factorial=tamSayiAl();
                        result=factroialMN(factorial);
                        showResult(result);
                        break;
                    case 6:
                        random=tamSayiAl();
                        result=randomMN(random);
                        showResult(result);
                        break;
                    default:
                        System.out.println("kullanim icin tesekkurler");
                        break;

                }
            }while (secim!=7);
        System.out.println("cikis yaptiniz");
    }
    public static void menuMN(){
        System.out.println("1-sum/n2-extraction/n3-multipy/n4-divide/n5-factorial/n6-randomNumber");
    }
    public static int secimMN(){
        Scanner input=new Scanner(System.in);
        int secim1;
        menuMN();
        secim1=input.nextInt();
        while (secim1<1 || secim1>6){
            menuMN();
            secim1=input.nextInt();
        }
        return secim1;
        }
        public static double takeValueMN(){
        Scanner input=new Scanner(System.in);
            System.out.println("sayi giriniz");
        double num1FM=input.nextDouble();
        return num1FM;
        }
        public static double sumMN(double num1TM,double num2TM){
        return num1TM+num2TM;
        }
        public static double extractionMN(double num1TM, double num2TM){
        return num1TM-num2TM;
        }
        public static double divideMN(double num1TM, double num2TM){
        return num1TM/num2TM;
    }
        public static double multpyMN(double num1TM, double num2TM){
        return num1TM*num2TM;
    }
        public static int tamSayiAl(){
            Scanner input=new Scanner(System.in);
            System.out.println("tam sayi giriniz");
            int tamSayiFM=input.nextInt();
            return tamSayiFM;
    }
        public static int factroialMN(int a){
        int factorial=1;
        for (int i=1;i<=a;i++){
            factorial*=i;
        }
        return factorial;
        }
        public static int randomMN(int istenenAralik){
        Random inputRandom=new Random();
        return inputRandom.nextInt(istenenAralik);
        }
        public static void showResult(double result){
            System.out.println("isleminizin sonucu="+ result);
        }
}
