import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan Jumlah Elemen : ");
        int elemen = sc.nextInt();

        int[] arrayInt = new int[elemen];
        for (int i = 0; i < elemen; i++) {
            System.out.println("Masukkan elemen nilai ke- " + (i) + " : ");
            arrayInt[i] = sc.nextInt();

        }
        int tertinggi = arrayInt[0];
        int terendah = arrayInt[0];
        int jml = 0;

        for (int i = 0; i < elemen; i++) {
            jml += arrayInt[i];
            if (arrayInt[i] > tertinggi) {
                tertinggi = arrayInt[i];
            } else if (arrayInt[i] < terendah) {
                terendah = arrayInt[i];
            }
        }
        double rata = (double) jml / elemen;
        System.out.println("Nilai tetinggi       : " + tertinggi);
        System.out.println("Nilai terendah       : " + terendah);
        System.out.println("Nilai Rata-rata    : " + rata);
    }

}
