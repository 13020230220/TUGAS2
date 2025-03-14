import java.util.Scanner; // Mengimpor kelas Scanner

/* Contoh baca nilai x, */
/* Jumlahkan nilai yang dibaca dengan ITERATE */
public class no16PrintXRepeat {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // Kamus
        int Sum; // Variabel untuk menyimpan hasil penjumlahan
        int x; // Variabel untuk menyimpan input
        Scanner masukan = new Scanner(System.in); // Membuat objek Scanner untuk input

        // Program
        System.out.print("Masukkan nilai x (int), akhiri dengan 999: ");
        x = masukan.nextInt(); // Membaca nilai pertama

        if (x == 999) {
            System.out.print("Kasus kosong \n");
        } else { // Minimal ada satu data yang dijumlahkan
            Sum = 0; // Inisialisasi; invariant !!
            do {
                Sum = Sum + x; // Proses: menjumlahkan nilai
                System.out.print("Masukkan nilai x (int), akhiri dengan 999: ");
                x = masukan.nextInt(); // Membaca nilai berikutnya
            } while (x != 999); // Kondisi pengulangan
            System.out.println("Hasil penjumlahan = " + Sum); // Menampilkan hasil penjumlahan
        }

        masukan.close(); // Menutup Scanner untuk menghindari kebocoran sumber daya
    }
}