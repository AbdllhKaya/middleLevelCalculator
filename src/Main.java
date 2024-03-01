import java.util.Scanner;
public class Main {

    static int sum(int a, int b){
        int result=a+b;
        System.out.println("Toplam :" + result);
        return result;
    }
    static int minus (int a, int b) {
        int result = a - b;
        System.out.println("çıkarma :"+ result);
        return result;
    }

    static int times (int a, int b){
        int result= a*b;
        System.out.println(" Çarpma: "+ result );
        return result;
    }

    static int divided (int a, int b) {
        if (b==0){
        System.out.println("ikinci sayı 0'dan farklı olmalı!")}
        return 0;

        int result = a / b;
        System.out.println(" Bölme: " + result);
        return result;}

    static int power (int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
            System.out.println(" üslü sayı: " + result);
        }
        return result;
    }

    static int mod (int a, int b) {
        return a%b ;
    }
    static void calc (int a, int b) {
        System.out.println("çevre: " + 2*(a+b))   ;
        System.out.println("alan: " + a*b);}


        public static void main (String[]args){
            Scanner scan = new Scanner(System.in);
            int select;

            String menu = "1 - Toplama işlemi\n"
                    + "2 - Çıkarma işlemi\n"
                    + "3 - Çarpma işlemi\n"
                    + "4 - Bölme işlemi\n"
                    + "5 - Üslü sayı hesaplama\n"
                    + "6 - Mod alma işlemi\n"
                    + "7 - Dikdörtgen alan ve çevre hesaplama\n"
                    + "8 - Çıkış yap\n";

        }

        while (true){
        Object case1;
        case1 ; 

            
    }


        }



