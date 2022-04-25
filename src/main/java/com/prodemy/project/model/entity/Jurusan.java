package com.prodemy.project.model.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_jurusan")
public class Jurusan {
    @Id
    private Integer kode_jurusan;
    private String jurusan;

    public Integer getKodeJurusan() {
        return kode_jurusan;
    }

    public void setKodeJurusan(Integer kodeJurusan) {
        this.kode_jurusan = kodeJurusan;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }
}
