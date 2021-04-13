package STEP9_METHODS_Basic;
import java.util.Scanner;
public class A1_METHOD_Fact {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("Please write your name");
        String name=input.next();
        System.out.println("How many times you would you like your name to be spelled?");
        int amount=input.nextInt();
        EnesMethod(amount, name);
        System.out.println();

        System.out.println("Which number do you want factorial");
        int number=input.nextInt();
        MustafaMethod(number);
    }
    public static void EnesMethod(int amountM, String nameM ){
        System.out.println("Hello Enes");
        for (int i=0;i<amountM;i++){
            System.out.print(nameM + "-");
        }
    }
    public static void MustafaMethod(int amountM){
        int factorial=1;
        for (int i=1;i<=amountM;i++){
            factorial*=i;
        }
        System.out.println("result of the factorials transaction="+ factorial);

    }
}
