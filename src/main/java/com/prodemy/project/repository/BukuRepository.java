package com.prodemy.project.repository;

import com.prodemy.project.model.entity.Buku;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BukuRepository extends JpaRepository<Buku, Integer> {
}
