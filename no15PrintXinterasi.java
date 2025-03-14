import java.util.Scanner; // Mengimpor kelas Scanner

/* Contoh baca nilai x, */
/* Jumlahkan nilai yang dibaca dengan ITERATE */
public class no15PrintXinterasi {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // Kamus
        int Sum = 0;
        int x;
        Scanner masukan = new Scanner(System.in); // Membuat objek Scanner untuk input

        // Program
        System.out.print("Masukkan nilai x (int), akhiri dengan 999: ");
        x = masukan.nextInt(); // Membaca nilai pertama

        if (x == 999) {
            System.out.print("Kasus kosong \n");
        } else { // Minimal ada satu data yang dijumlahkan
            Sum = x; // Inisialisasi; invariant !!
            for (;;) { // Loop tak terbatas
                System.out.print("Masukkan nilai x (int), akhiri dengan 999: ");
                x = masukan.nextInt(); // Membaca nilai berikutnya
                if (x == 999) {
                    break; // Keluar dari loop jika x adalah 999
                } else {
                    Sum = Sum + x; // Proses: menjumlahkan nilai
                }
            }
        }

        System.out.println("Hasil penjumlahan = " + Sum); // Menampilkan hasil penjumlahan
        masukan.close(); // Menutup Scanner untuk menghindari kebocoran sumber daya
    }
}