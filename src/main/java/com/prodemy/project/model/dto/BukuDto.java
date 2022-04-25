package com.prodemy.project.model.dto;

public class BukuDto {
    private Integer id_buku;
    private Character kode_buku;
    private String judul_buku;
    private String penulis_buku;

    public Integer getId_buku() {
        return id_buku;
    }

    public void setId_buku(Integer id_buku) {
        this.id_buku = id_buku;
    }

    public Character getKode_buku() {
        return kode_buku;
    }

    public void setKode_buku(Character kode_buku) {
        this.kode_buku = kode_buku;
    }

    public String getJudul_buku() {
        return judul_buku;
    }

    public void setJudul_buku(String judul_buku) {
        this.judul_buku = judul_buku;
    }

    public String getPenulis_buku() {
        return penulis_buku;
    }

    public void setPenulis_buku(String penulis_buku) {
        this.penulis_buku = penulis_buku;
    }
}
