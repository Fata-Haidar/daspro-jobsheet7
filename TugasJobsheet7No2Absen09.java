import java.util.Scanner;
public class TugasJobsheet7No2Absen09 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int jenisKendaraan; 
        int durasiParkir;
        int totalPembayaran = 0;
        int biaya = 0;

        while (true) {
            System.out.print("Masukkan jenis kendaraan (1 untuk mobil, 2 untuk motor, 0 untuk keluar): ");
            jenisKendaraan = scanner.nextInt();

            
            if (jenisKendaraan == 0) {
                break;
            }  
             if (jenisKendaraan == 1) { 
                System.out.print("Masukkan durasi parkir (dalam jam): ");
                durasiParkir = scanner.nextInt();
                if (durasiParkir < 0) {
                    System.out.println("Durasi parkir tidak valid. Silakan masukkan durasi yang valid.");
                    continue; 
                } if (durasiParkir > 5) {
                    biaya = 12500; 
                }  else {
                    biaya = durasiParkir * 3000;
                }
                
            } else if (jenisKendaraan == 2) {
                System.out.print("Masukkan durasi parkir (dalam jam): ");
                durasiParkir = scanner.nextInt();
                if (durasiParkir < 0) {
                    System.out.println("Durasi parkir tidak valid. Silakan masukkan durasi yang valid.");
                    continue; 
                } if (durasiParkir > 5) {
                    biaya = 12500; 
                }  else {
                    biaya = durasiParkir * 3000;
                }
            } else {
                System.out.println("Jenis kendaraan tidak valid. Silakan masukkan 1 atau 2.");
                continue; 
            }
            totalPembayaran += biaya; 
            System.out.println("Biaya parkir untuk kendaraan: Rp " + biaya);
        }

        System.out.println("Total pembayaran parkir hari ini: Rp " + totalPembayaran);
    }
}