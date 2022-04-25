package com.prodemy.project.model.dto;

import java.util.Date;

public class PeminjamanDto {
    private Integer id_peminjaman;
    private Integer id_buku;
    private Integer id_anggota;

    public Integer getId_peminjaman() {
        return id_peminjaman;
    }

    public void setId_peminjaman(Integer id_peminjaman) {
        this.id_peminjaman = id_peminjaman;
    }

    public Integer getId_buku() {
        return id_buku;
    }

    public void setId_buku(Integer id_buku) {
        this.id_buku = id_buku;
    }

    public Integer getId_anggota() {
        return id_anggota;
    }

    public void setId_anggota(Integer id_anggota) {
        this.id_anggota = id_anggota;
    }
}
