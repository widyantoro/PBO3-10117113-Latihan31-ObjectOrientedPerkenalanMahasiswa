/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117113.latihan31.perkenalanmahasiswa;

/**
 *
 * Nama     : Eka Widyantoro
 * Kelas    : IF-3
 * NIM      : 10117113
 * Deskripsi Program : program ini berisi program untuk menmpilkan nama beserta
 * NIM mahasiswa
 */
public class PBO310117113Latihan31PerkenalanMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     Mahasiswa mhs1 = new Mahasiswa();
     mhs1.nim = "10117113";
     mhs1.nama = "Eka Widyantoro";
     mhs1.perkenalanDiri(mhs1.nim, mhs1.nama);
     
     Mahasiswa mhs2 = new Mahasiswa();
     mhs2.nim = "10117114";
     mhs2.nama = "Babang Gansteng";
     mhs2.perkenalanDiri(mhs2.nim, mhs2.nama);     
        
     Mahasiswa mhs3 = new Mahasiswa();
     mhs3.nim = "10117116";
     mhs3.nama = "Mas Gatot";
     mhs3.perkenalanDiri(mhs3.nim, mhs3.nama);
    }
    
}
