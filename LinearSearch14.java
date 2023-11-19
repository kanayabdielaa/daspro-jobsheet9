import java.util.Scanner;

public class LinearSearch14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan jumlah elemen array: ");
        int elemen = sc.nextInt();

        // int[] arrayInt = {34, 18, 26, 48, 72, 20, 56, 63};
        int[] arrayInt = new int[elemen];
        for (int i = 0; i < elemen; i++) {
            System.out.println("Masukkan elemen array le- " +(i)+ " : ");
            arrayInt[i] = sc.nextInt();
        }
        
        System.out.println("Masukkan key yang ingin dicari: ");
        int key = sc.nextInt();
        // int key = 20;
        int hasil = 1;
        for (int i = 0; i < elemen; i++) {
            if (arrayInt[i] == key) {
                hasil = i;
                System.out.println("Key ada dalam array pada posisi indeks ke-" +hasil);
              //  break;
            } else {
                System.out.println("Key tidak ditemukan ");
                break;
            }
        }
    }
}
