package com.prodemy.project.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_petugas")
public class Petugas {
    @Id
    @Column (name = "id_petugas")
    private Integer id_petugas;
    @Column (name = "nama_petugas", nullable = false)
    private String nama_petugas;
    @Column(nullable = false)
    private String jabatan_petugas;
    private Character no_telp_petugas;
    private String alamat_petugas;

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

    public Character getNo_telp_petugas() {
        return no_telp_petugas;
    }

    public void setNo_telp_petugas(Character no_telp_petugas) {
        this.no_telp_petugas = no_telp_petugas;
    }

    public String getAlamat_petugas() {
        return alamat_petugas;
    }

    public void setAlamat_petugas(String alamat_petugas) {
        this.alamat_petugas = alamat_petugas;
    }
}
