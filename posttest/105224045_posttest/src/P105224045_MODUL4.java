import java.util.Scanner;

public class P105224045_MODUL4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Simulasi pendaftaran Anton
        System.out.print("Masukkan Nama: ");
        String nama = input.nextLine(); 
        System.out.print("Masukkan No HP: ");
        String noHP = input.nextLine(); 

        Pelanggan anton = new Pelanggan(nama, noHP);

        // Anton setor Rp 50.000
        System.out.println("\n--- Skenario 1: Setor Pertama ---");
        anton.isiDana(50000);

        // Coba bayar listrik Rp 60.000 (Pasti gagal)
        System.out.println("\n--- Skenario 2: Bayar Listrik Pertama ---");
        anton.bayarTagihan("Listrik", 60000);

        // Anton setor lagi Rp 20.000
        System.out.println("\n--- Skenario 3: Setor Lagi ---");
        anton.isiDana(20000);

        // Coba bayar listrik lagi (Harusnya berhasil: 50k + 20k - 60k)
        System.out.println("\n--- Skenario 4: Bayar Listrik Kedua ---");
        anton.bayarTagihan("Listrik", 60000);

        // Tampilkan sisa uang paling akurat
        anton.tampilkanSaldoAkhir();
        
        input.close();
    }
}