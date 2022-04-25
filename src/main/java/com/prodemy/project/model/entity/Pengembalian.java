package com.prodemy.project.model.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "t_pengembalian")
public class Pengembalian {
    @Id
    private Integer id_pengembalian;
    private Date tanggal_pengembalian;
    private Integer denda;
    private Integer id_buku;
    private Integer id_anggota;
    private Integer id_petugas;

    public Integer getId_pengembalian() {
        return id_pengembalian;
    }

    public void setId_pengembalian(Integer id_pengembalian) {
        this.id_pengembalian = id_pengembalian;
    }

    public Date getTanggal_pengembalian() {
        return tanggal_pengembalian;
    }

    public void setTanggal_pengembalian(Date tanggal_pengembalian) {
        this.tanggal_pengembalian = tanggal_pengembalian;
    }

    public Integer getDenda() {
        return denda;
    }

    public void setDenda(Integer denda) {
        this.denda = denda;
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
