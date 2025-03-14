import java.util.Scanner; 

/* Baca N, Print i = 1 s/d N dengan WHILE */
public class no13PrintWhile {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // Kamus
        int N;
        int i;
        Scanner masukan = new Scanner(System.in); 

        // Program
        System.out.print("Nilai N > 0 = "); 
        N = masukan.nextInt();

        // Validasi input
        if (N <= 0) {
            System.out.println("Nilai N harus lebih besar dari 0.");
        } else {
            i = 1; 
            System.out.print("Print i dengan WHILE: \n");
            while (i <= N) { // Kondisi pengulangan
                System.out.println(i); 
                i++; 
            } // Akhir dari loop while
        }

        masukan.close(); 
    }
}