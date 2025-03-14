import java.util.Scanner; // Mengimpor kelas Scanner

/* Contoh baca nilai x, */
/* Jumlahkan nilai yang dibaca dengan WHILE */
public class no17PrintXWhile {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // Kamus
        int Sum; 
        int x; 
        Scanner masukan = new Scanner(System.in); 

        // Program
        Sum = 0; // Inisialisasi
        System.out.print("Masukkan nilai x (int), akhiri dengan 999: ");
        x = masukan.nextInt(); 

        while (x != 999) { 
            Sum = Sum + x; 
            System.out.print("Masukkan nilai x (int), akhiri dengan 999: ");
            x = masukan.nextInt(); 
        }

        System.out.println("Hasil penjumlahan = " + Sum); 
        masukan.close(); 
    }
}