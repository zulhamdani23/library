package com.prodemy.project.model.entity;

import javax.persistence.*;

@Entity
@Table(name = "t_buku")
public class Buku {
    @Id
    @Column(name = "idbuku")
    private Integer id_buku;
    @Column(unique = true, nullable = false)
	private Character kode_buku;
    @Column(nullable = false)
    private String judul_buku;
	private String penulis_buku;
	private String penerbit_buku;
    private Integer tahun_penerbit;
    private Integer stok;
    @ManyToOne
    @JoinColumn
    private Rak rak;

    public Rak getRak() {
        return rak;
    }

    public void setRak(Rak rak) {
        this.rak = rak;
    }

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

    public String getPenerbit_buku() {
        return penerbit_buku;
    }

    public void setPenerbit_buku(String penerbit_buku) {
        this.penerbit_buku = penerbit_buku;
    }

    public Integer getTahun_penerbit() {
        return tahun_penerbit;
    }

    public void setTahun_penerbit(Integer tahun_penerbit) {
        this.tahun_penerbit = tahun_penerbit;
    }

    public Integer getStok() {
        return stok;
    }

    public void setStok(Integer stok) {
        this.stok = stok;
    }
}
