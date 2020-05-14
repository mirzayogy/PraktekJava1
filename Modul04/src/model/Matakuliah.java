package model;

public class Matakuliah {

    int idMatakuliah;
    String namaMatakuliah;
    String singkatanMatakuliah;
    String namaDosen;
    String kontakDosen;
    boolean aktif;

    public Matakuliah(int idMatakuliah, String namaMatakuliah, String singkatanMatakuliah, String namaDosen, String kontakDosen, boolean aktif) {
        this.idMatakuliah = idMatakuliah;
        this.namaMatakuliah = namaMatakuliah;
        this.singkatanMatakuliah = singkatanMatakuliah;
        this.namaDosen = namaDosen;
        this.kontakDosen = kontakDosen;
        this.aktif = aktif;
    }

    
}
