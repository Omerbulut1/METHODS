package STEP9_METHODS_Basic;
import java.util.Scanner;
public class ADSFG {
    public static void main(String[] args) {
        int sayi;
        boolean durum;
        sayi=enterNumberM();
        durum=condition(sayi);

        if (durum){
            System.out.println("cifttir");
        }
        else
            System.out.println("tektir");


        /*String name,sname;
        name=isimver("isim gir la");
        sname=isimver("soyadini soyle la");
        System.out.println(name);
        System.out.println(sname);

    }
    public static String isimver(String istenilen){
        Scanner input=new Scanner(System.in);
        String nameFM;
        System.out.println(istenilen);
        nameFM=input.next();
        return nameFM;   */


    }
    public static int enterNumberM(){
        Scanner input=new Scanner(System.in);
        int sayiFM;
        System.out.println("write a number");
        sayiFM=input.nextInt();
        return sayiFM;
    }
    public static boolean condition(int sayi2FM) {
        if (sayi2FM % 2 == 0) {
            return true;
        }
        else
            return false;
    }
}