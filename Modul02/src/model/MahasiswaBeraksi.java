package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MahasiswaBeraksi {
    public static void main(String[] args) throws ParseException {

        String polaTanggal = "dd-MM-yyyy";
        SimpleDateFormat simpleDateFormat =new SimpleDateFormat(polaTanggal);

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.npm = "19639999";
        mahasiswa.nama = "Sembilu";
        mahasiswa.tanggalLahir = simpleDateFormat.parse("09-09-2009");

        mahasiswa.tampilkanAtribut();

        Mahasiswa mahasiswa2 = new Mahasiswa();
        mahasiswa2.npm = "19638888";
        mahasiswa2.nama = "Delapu";
        mahasiswa2.tanggalLahir = simpleDateFormat.parse("08-08-2008");

        mahasiswa2.tampilkanAtribut();
    }
}
