import java.util.Scanner; // Mengimpor kelas Scanner

/* Contoh pemakaian IF tiga kasus: wujud air */
public class no19Tempair {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // Kamus
        int T; // Variabel untuk menyimpan temperatur
        Scanner masukan = new Scanner(System.in); // Membuat objek Scanner untuk input

        // Program
        System.out.print("Contoh IF tiga kasus \n");
        System.out.print("Temperatur (der. C) = ");
        T = masukan.nextInt(); // Membaca nilai temperatur

        if (T < 0) {
            System.out.print("Wujud air beku \n" + T);
        } else if (T <= 100) { // Jika T >= 0 dan T <= 100
            System.out.print("Wujud air cair \n" + T);
        } else { // Jika T > 100
            System.out.print("Wujud air uap/gas \n" + T);
        }

        masukan.close(); // Menutup Scanner untuk menghindari kebocoran sumber daya
    }
}