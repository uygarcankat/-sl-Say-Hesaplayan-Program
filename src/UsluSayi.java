import java.util.Scanner;

public class UsluSayi {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.println("Lütfen bir değer giriniz");

        int number = input.nextInt();

        final int x = number;

        System.out.println("Lütfen bir üst değeri giriniz");

        int ust = input.nextInt();

        for(int i=2; ust>=i ; i++){

            number*=x;
        }
        System.out.println(number);









    }
}
