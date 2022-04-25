package com.prodemy.project.repository;

import com.prodemy.project.model.entity.Petugas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PetugasRepository extends JpaRepository<Petugas, Integer> {
}
