public class pelanggan {
    String namaLengkap;
    String nomorPonsel;
    double saldo; // Pake double biar aman buat nominal uang

    // Constructor: Daftarin pelanggan baru, saldo otomatis 0
    public Pelanggan(String nama, String nomor) {
        this.namaLengkap = nama;
        this.nomorPonsel = nomor;
        this.saldo = 0.0; // Saldo awal nol mutlak
        System.out.println("Pendaftaran Berhasil! Halo " + this.namaLengkap);
    }

    // Pengisian Dana (Setoran)
    void isiDana(double jumlah) {
        if (jumlah >= 10000) {
            this.saldo += jumlah;
            System.out.println("--- STRUK RESI DUITKU ---");
            System.out.println("Berhasil setor: Rp " + jumlah);
            System.out.println("Saldo sekarang: Rp " + this.saldo);
            System.out.println("-------------------------");
        } else {
            System.out.println("PERINGATAN KERAS: Minimum setoran adalah Rp 10.000!");
        }
    }

    // Pelunasan Tagihan
    void bayarTagihan(String jenisTagihan, double jumlah) {
        System.out.println("Mencoba bayar " + jenisTagihan + " sebesar Rp " + jumlah + "...");
        if (this.saldo >= jumlah) {
            this.saldo -= jumlah;
            System.out.println("KONFIRMASI: Pelunasan " + jenisTagihan + " BERHASIL.");
            System.out.println("Sisa saldo: Rp " + this.saldo);
        } else {
            System.out.println("KEGAGALAN MUTLAK: Saldo tidak cukup!");
        }
    }

    // Method buat liat saldo terakhir
    void tampilkanSaldoAkhir() {
        System.out.println("\nSisa uang " + this.namaLengkap + " di sistem: Rp " + this.saldo);
    }
}
