import java.util.Scanner; // Mengimpor kelas Scanner

/* Contoh program yang mengandung prosedur dan fungsi */
public class no18SubProgram {
    /**
     * @param args
     */
    public static int maxab(int a, int b) {
        /* Mencari maksimum dua bilangan bulat */
        return (a >= b) ? a : b;
    }

    public static int[] tukar(int a, int b) {
        /* Menukar dua bilangan bulat dan mengembalikan hasilnya dalam array */
        int temp = a;
        a = b;
        b = temp;
        return new int[]{a, b}; // Mengembalikan array yang berisi nilai yang ditukar
    }

    /*** Program Utama ***/
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        /* Membaca dua bilangan integer */
        /* Menuliskan maksimum dua bilangan yang dibaca dg memanggil fungsi */
        /* Menukar kedua bilangan dengan 'prosedur' */
        int a, b;
        Scanner masukan = new Scanner(System.in); // Membuat objek Scanner untuk input

        System.out.print("Maksimum dua bilangan\n");
        System.out.print("Ketikkan dua bilangan, pisahkan dg RETURN:\n");
        a = masukan.nextInt(); // Membaca bilangan pertama
        b = masukan.nextInt(); // Membaca bilangan kedua

        System.out.println("Ke dua bilangan: a = " + a + " b = " + b);
        System.out.println("Maksimum = " + maxab(a, b)); // Menampilkan maksimum

        System.out.print("Tukar kedua bilangan...\n");
        int[] hasilTukar = tukar(a, b); // Menukar bilangan
        System.out.println("Ke dua bilangan setelah tukar: a = " + hasilTukar[0] + " b = " + hasilTukar[1]);

        masukan.close(); // Menutup Scanner untuk menghindari kebocoran sumber daya
    }
}