package com.prodemy.project.repository;

import com.prodemy.project.model.entity.Anggota;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnggotaRepository extends JpaRepository<Anggota, Integer> {
}
