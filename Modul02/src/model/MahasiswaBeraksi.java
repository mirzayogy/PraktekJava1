package model;

import java.util.Date;

public class MahasiswaBeraksi {
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.npm = "19639999";
        mahasiswa.nama = "Sembilu";
        mahasiswa.tanggalLahir = new Date();
    }
}
