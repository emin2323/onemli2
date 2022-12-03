package patikatemelkavramlar;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class NotOrtalamasiHesaplama {
    /*
    Not Ortalaması Hesaplayan Program
Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını kullanıcıdan alan
ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın.

Ödev
Aynı program içerisinde koşullu ifadeler kullanılarak, eğer kullanıcının ortalaması 60'dan büyük ise ekrana "Sınıfı Geçti" ,
 küçük ise "Sınıfta Kaldı" yazsın.

Not : If ve Else kullanılmayacak...
     */
    public static void main(String[] args) {

        int matematik, fizik, kimya, turkce, tarih, muzik;

        Scanner input = new Scanner(System.in);

        System.out.println("Matematik notu: ");

        matematik = input.nextInt();

        System.out.println("Turkce notu: ");

        turkce = input.nextInt();


        System.out.println("Fizik notu: ");
        fizik = input.nextInt();

        System.out.println("Kimya notu: ");
        kimya = input.nextInt();

        System.out.println("Tarih notu: ");
        tarih = input.nextInt();

        System.out.println("Müzik notu: ");
        muzik = input.nextInt();

        int toplam = matematik+fizik+kimya+turkce+tarih+muzik;
        double ortalama = toplam/6;


        String sonuc =ortalama>60? ("Sinifi Gecti"):("Sinifta Kaldi");
        System.out.println(sonuc);


    }
}
