
package ch02;

public class Pegawai {
    String nik;
    String nama;
    String jabatan;
    boolean isAktif;
    
    public String getJabatan() {
        return jabatan;
    }
    public boolean isAktif() {
        return isAktif;
    }
    public void cetak () {
        System.out.println("NIK : " + nik);
        System.out.println("Nama : " + nama);
        System.out.println("Jabatan : " + jabatan);
        System.out.println("Status : " + isAktif);
    }
}