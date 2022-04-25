package com.prodemy.project.model.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "t_peminjaman")
public class Peminjaman {
    @Id
    private Integer id_peminjaman;
    private Date tanggal_pinjam;
    private Date tanggal_kembali;
    private Integer id_buku;
    private Integer id_anggota;
    private Integer id_petugas;

    public Integer getId_peminjaman() {
        return id_peminjaman;
    }

    public void setId_peminjaman(Integer id_peminjaman) {
        this.id_peminjaman = id_peminjaman;
    }

    public Date getTanggal_pinjam() {
        return tanggal_pinjam;
    }

    public void setTanggal_pinjam(Date tanggal_pinjam) {
        this.tanggal_pinjam = tanggal_pinjam;
    }

    public Date getTanggal_kembali() {
        return tanggal_kembali;
    }

    public void setTanggal_kembali(Date tanggal_kembali) {
        this.tanggal_kembali = tanggal_kembali;
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

    public Integer getId_petugas() {
        return id_petugas;
    }

    public void setId_petugas(Integer id_petugas) {
        this.id_petugas = id_petugas;
    }
}
