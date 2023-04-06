package com.springCourse.studentsystem.model;
import java.time.LocalDate; // import the LocalDate class

// ADD annotate class with entity annotation
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int nim;
//    private String name;
//    private String address;
    private String nama;
    private String kelas;
    private String jurusan;
    private LocalDate tanggal_lahir;
    //umlah_sks|status
    private double jumlah_sks;
    private byte status;

    public int getNim() {
        return nim;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public LocalDate getTanggal_lahir() {
        return tanggal_lahir;
    }

    public void setTanggal_lahir(LocalDate tanggal_lahir) {
        this.tanggal_lahir = tanggal_lahir;
    }

    public double getJumlah_sks() {
        return jumlah_sks;
    }

    public void setJumlah_sks(double jumlah_sks) {
        this.jumlah_sks = jumlah_sks;
    }

    public byte getStatus() {
        return status;
    }

    public void setStatus(byte status) {
        this.status = status;
    }
//CREATE constructor
    //Win/Linux Alt + Insert

    public Student() {

    }
    //Generate
    //Right Click and chose Generate as right


}
