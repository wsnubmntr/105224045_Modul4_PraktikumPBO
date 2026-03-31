class Mahasiswa {
    String nama;
    int umur;
    String jurusan;

    void tampilkanData() {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
        System.out.println("Jurusan: " + jurusan);
    }
}

public class P105224045_MODUL4 { 
    public static void main(String[] args) {
        Mahasiswa mhsBaru = new Mahasiswa();

        mhsBaru.nama = "Wisnu Bimantoro";
        mhsBaru.umur = 20;
        mhsBaru.jurusan = "Ilmu Komputer";

        mhsBaru.tampilkanData();
    }
}