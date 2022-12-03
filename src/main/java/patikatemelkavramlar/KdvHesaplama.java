package patikatemelkavramlar;

import java.util.Scanner;

public class KdvHesaplama {
    /*
    KDV Tutarı Hesaplayan Program
Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.

(Not : KDV tutarını 18% olarak alın)

KDV'siz Fiyat = 10;

KDV'li Fiyat = 11.8;

KDV tutarı = 1.8;

Ödev
Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 ,
tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.
     */

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir turar giriniz");
        int fiyat = input.nextInt();

        double kdv = 0.18;

        double kdvli=fiyat+(fiyat*kdv);
        double kdvTutari = fiyat*kdv;
        System.out.println("KDV'siz Fiyat = "+fiyat+ "\nKDV'li Fiyat = "+ kdvli +" \nKDV tutarı =  " + kdvTutari);

        System.out.println();
        System.out.println("Girilen degere gore Kdv hesaplama");
        double  tutar = fiyat<1000 ? (fiyat+(fiyat*0.18)):(fiyat+(fiyat*0.08));
        System.out.println(tutar);


    }

}
