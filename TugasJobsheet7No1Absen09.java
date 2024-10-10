import java.util.Scanner;
public class TugasJobsheet7No1Absen09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int hargaTiket = 50000;
        int totalTiket = 0, tiket = 1;
        double totalHarga = 0 , diskon = 0;

        while (tiket > 0) {
            System.out.print("Masukkan jumlah tiket yang dibeli: ");
            int jumlahTiket = scanner.nextInt();

            if (jumlahTiket == 0) {
                System.out.println("Total tiket yang terjual:" + totalTiket);
            System.out.println("Total harga penjualan tiket: Rp " + totalHarga);
                break;
            }
            if (jumlahTiket < 0) {
                System.out.println("Input tidak vaid, harap input ulang.");
                continue;
            }
            
            if (jumlahTiket > 10) {
                diskon = 0.15; 
            
                tiket++;
                
            } else if (jumlahTiket > 4) {
                diskon = 0.10; 
                
                tiket++;
            }
            double hargaSetelahDiskon = hargaTiket * jumlahTiket * (1 - diskon);
            totalTiket += jumlahTiket;
            totalHarga += hargaSetelahDiskon;
            System.out.println("Total tiket yang terjual:" + totalTiket);
            System.out.println("Total harga penjualan tiket: Rp " + totalHarga);
        }
    }

    
}