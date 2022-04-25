package com.prodemy.project.model.dto;

public class PetugasDto {
    private Integer id_petugas;
    private String nama_petugas;
    private String jabatan_petugas;

    public Integer getId_petugas() {
        return id_petugas;
    }

    public void setId_petugas(Integer id_petugas) {
        this.id_petugas = id_petugas;
    }

    public String getNama_petugas() {
        return nama_petugas;
    }

    public void setNama_petugas(String nama_petugas) {
        this.nama_petugas = nama_petugas;
    }

    public String getJabatan_petugas() {
        return jabatan_petugas;
    }

    public void setJabatan_petugas(String jabatan_petugas) {
        this.jabatan_petugas = jabatan_petugas;
    }
}
