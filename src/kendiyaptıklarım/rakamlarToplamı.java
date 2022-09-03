package kendiyaptıklarım;

import java.util.Scanner;

public class rakamlarToplamı {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen dort basamakli bir sayı giriniz");
        int sayi= scan.nextInt();

        int rakam=0;
        int rakamlarToplamı=0;

        rakam=sayi%10;
        rakamlarToplamı+=rakam;
        sayi/=10;

        rakam=sayi%10;
        rakamlarToplamı+=rakam;
        sayi/=10;

        rakam=sayi%10;
        rakamlarToplamı+=rakam;
        sayi/=10;

        rakam=sayi%10;
        rakamlarToplamı+=rakam;
        sayi/=10;



    }
}
