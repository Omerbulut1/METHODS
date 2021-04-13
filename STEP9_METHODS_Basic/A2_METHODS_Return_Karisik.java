package STEP9_METHODS_Basic;
import java.util.Scanner;
public class A2_METHODS_Return_Karisik {
    public static void main(String[] args) {
        String name;
        name=GermanyMethod();
        System.out.println(name);
    }
    public static String GermanyMethod(){
        Scanner input=new Scanner(System.in);
        String name;
        System.out.println("write your name");
        name=input.next();
        return name;
    }
}
