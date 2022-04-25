package com.prodemy.project.model.dto;

import java.util.Date;

public class PengembalianDto {
    private Integer id_pengembalian;
    private Date tanggal_pengembalian;
    private Integer id_buku;

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

    public Integer getId_buku() {
        return id_buku;
    }

    public void setId_buku(Integer id_buku) {
        this.id_buku = id_buku;
    }
}
