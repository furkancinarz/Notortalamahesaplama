//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

class test {
    public test() {
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Matematik notunuz : ");
        int mat = inp.nextInt();
        System.out.print("Fizik notunuz : ");
        int fizik = inp.nextInt();
        System.out.print("Kimya notunuz : ");
        int kimya = inp.nextInt();
        System.out.print("Türkçe notunuz : ");
        int turkce = inp.nextInt();
        System.out.print("Tarih notunuz : ");
        int tarih = inp.nextInt();
        System.out.print("Müzik notunuz : ");
        int muzik = inp.nextInt();
        int toplam = mat + fizik + kimya + turkce + tarih + muzik;
        double sonuc = (double)toplam / 6.0;
        System.out.println("Ortalamanız :" + sonuc);
        boolean deger = sonuc >= 60.0;
        System.out.println(deger ? "Sınıfı Geçti" : "Sınıfta Kaldı");
    }
}
