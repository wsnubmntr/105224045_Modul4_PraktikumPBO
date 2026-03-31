class MesinKopi {
    // Soal 1
    int bijiKopi;
    int air;
    int susu;

    // Soal 4
    public MesinKopi() {
        this.bijiKopi = 0;
        this.air = 0;
        this.susu = 0;
        System.out.println("Sistem: Mesin baru berhasil diinisialisasi (Semua tangki kosong).");
    }

    // Soal 2
    void isiUlangBahan(int kopi, int air, int susu) {
        this.bijiKopi += kopi;
        this.air += air;
        this.susu += susu;
        System.out.println("Sistem: Bahan baku berhasil diisi ulang!");
    }

    // Soal 3
    boolean cekKetersediaanCappuccino() {
        if (this.bijiKopi >= 15 && this.air >= 50 && this.susu >= 100) {
            return true;
        } else {
            return false;
        }
    }
}