package com.prodemy.project.model.entity;


import javax.persistence.*;

@Entity
@Table(name = "t_anggota")
public class Anggota {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id_anggota")
    private Integer id_anggota;
    @Column (name = "kode_anggota", unique = true, nullable = false)
    private Character kode_anggota;
    @Column (name = "nama_anggota", nullable = false)
    private String nama_anggota;
    @Column (name = "jk_anggota", nullable = false)
    private String jk_anggota;
    @Column (name = "jurusan_anggota", nullable = false)
    private String jurusan_anggota;


    @Column (name = "no_telp_anggota")
    private Character no_telp_anggota;
    private String alamat_anggota;

    public Integer getId_anggota() {
        return id_anggota;
    }

    public void setId_anggota(Integer id_anggota) {
        this.id_anggota = id_anggota;
    }

    public Character getKode_anggota() {
        return kode_anggota;
    }

    public void setKode_anggota(Character kode_anggota) {
        this.kode_anggota = kode_anggota;
    }

    public String getNama_anggota() {
        return nama_anggota;
    }

    public void setNama_anggota(String nama_anggota) {
        this.nama_anggota = nama_anggota;
    }

    public String getJk_anggota() {
        return jk_anggota;
    }

    public void setJk_anggota(String jk_anggota) {
        this.jk_anggota = jk_anggota;
    }

    public String getJurusan_anggota() {
        return jurusan_anggota;
    }

    public void setJurusan_anggota(String jurusan_anggota) {
        this.jurusan_anggota = jurusan_anggota;
    }

    public Character getNo_telp_anggota() {
        return no_telp_anggota;
    }

    public void setNo_telp_anggota(Character no_telp_anggota) {
        this.no_telp_anggota = no_telp_anggota;
    }

    public String getAlamat_anggota() {
        return alamat_anggota;
    }

    public void setAlamat_anggota(String alamat_anggota) {
        this.alamat_anggota = alamat_anggota;
    }
}
