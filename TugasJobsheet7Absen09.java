import java.util.Scanner;
public class TugasJobsheet7Absen09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double hargaTiket = 50000, totalHarga = 0, diskon = 0;
        int tiket, totalTiket = 0, i = 1;

        while (  i > 0 ) {
            System.out.print("Masukkan jumlah tiket yang dibeli: ");
            tiket = sc.nextInt();

            if (tiket < 0) {
                System.out.println("Input tidak valid. Silahkan input ulang.");
                continue;
            } 

            
            if (tiket > 10) {
                diskon = 0.15; 
            } else if (tiket > 4) {
                diskon = 0.10; 
            }

            double hargaSetelahDiskon = hargaTiket * tiket * (1 - diskon);
            totalTiket += tiket;
            totalHarga += hargaSetelahDiskon;

            
            i++;
        }
        System.out.println("Total tiket yang terjual: " + totalTiket);
            System.out.println("Total harga penjualan tiket: Rp " + totalHarga);

      

        
    }
}