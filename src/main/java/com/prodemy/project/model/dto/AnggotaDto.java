package com.prodemy.project.model.dto;

public class AnggotaDto {
    private Integer id_anggota;
    private Character kode_anggota;
    private String nama_anggota;

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
}
