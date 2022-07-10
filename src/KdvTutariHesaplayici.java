import java.util.Scanner;
        public class KdvTutariHesaplayici {
            public static void main(String[] args) {
                double fiyat, kdvliTutar, kdvOrani;
                boolean kdvDurumu;
                Scanner veri = new Scanner(System.in);

                System.out.println("Ürün fiyatını giriniz: ");
                fiyat = veri.nextDouble();

                kdvDurumu = (0 < fiyat) && (1000 > fiyat);
                kdvOrani = kdvDurumu ? 0.18 : 0.08;
                kdvliTutar = kdvOrani * fiyat + fiyat;

                System.out.println("KDV'siz Fiyatı: " + fiyat);
                System.out.println("KDV Oranı : " + kdvOrani);
                System.out.println("KDV Dahil Fiyatı " + kdvliTutar);
            }
}