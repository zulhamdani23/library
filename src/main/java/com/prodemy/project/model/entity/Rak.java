package com.prodemy.project.model.entity;

import javax.persistence.*;

@Entity
@Table (name = "t_rak")
public class Rak {
    @Id
    private Integer id_rak;
    @Column(nullable = false)
    private String nama_rak;
    @Column(nullable = false)
    private String lokasi_rak;

    @ManyToOne
    @JoinColumn(name = "idbuku")
    private Buku bukuid;

    public Integer getId_rak() {
        return id_rak;
    }

    public void setId_rak(Integer id_rak) {
        this.id_rak = id_rak;
    }

    public String getNama_rak() {
        return nama_rak;
    }

    public void setNama_rak(String nama_rak) {
        this.nama_rak = nama_rak;
    }

    public String getLokasi_rak() {
        return lokasi_rak;
    }

    public void setLokasi_rak(String lokasi_rak) {
        this.lokasi_rak = lokasi_rak;
    }

    public Buku getId_buku() {
        return bukuid;
    }

    public void setId_buku(Buku id_buku) {
        this.bukuid = bukuid;
    }
}
