public class no2 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // Program akan looping, akhiri dengan ^C
        System.out.println("Program akan looping, akhiri dengan ^C");
        
        while (true) {
            System.out.print("Print satu baris ....\n");
            try {
                // Menambahkan jeda 1 detik antara setiap iterasi
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // Menangani exception jika thread diinterupsi
                System.out.println("Loop terhenti.");
                break; // Keluar dari loop jika diinterupsi
            }
        }
    }
}