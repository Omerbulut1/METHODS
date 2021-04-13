package STEP9_METHODS_Basic;
import java.util.Scanner;
public class A4_METHODS_Return_Name_Surname {
    public static void main(String[] args) {
    String name;
    name=noOffenseM("write your name");
        System.out.println("NAME=" + name);
        name=noOffenseM("write your surname");
        System.out.println("SURNAME="+name);

    }
    public static String noOffenseM(String istenilen){
        Scanner input=new Scanner(System.in);
        String nameFM;
        System.out.println(istenilen);
        nameFM=input.next();
        return nameFM;
    }
}
