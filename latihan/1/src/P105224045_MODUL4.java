public class P105224045_MODUL4 {
    public static void main(String[] args) {
        // Soal 1 & 5: buat objek nyata
        MesinKopi mesinLobby = new MesinKopi();

        // Simulasi panggil Soal 3 (cek stok awal pasti false)
        System.out.println("Apakah mesin Lobby siap? " + mesinLobby.cekKetersediaanCappuccino());

        // Simulasi panggil Soal 2 (isi ulang)
        System.out.println("\n--- Mengisi ulang mesin di Lobby ---");
        mesinLobby.isiUlangBahan(50, 200, 300);

        // Simulasi panggil Soal 3 lagi (skrg harusnya true)
        if (mesinLobby.cekKetersediaanCappuccino()) {
            System.out.println("Status: Stok cukup, mesin Lobby siap melayani pembeli!");
        } else {
            System.out.println("Status: Stok masih kurang!");
        }
    }
}