package com.prodemy.project.controller;

import com.prodemy.project.model.dto.PeminjamanDto;
import com.prodemy.project.model.entity.Peminjaman;
import com.prodemy.project.repository.PeminjamanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/peminjaman")
public class PeminjamanController {
    //==convertDtoToEntity
    public Peminjaman convertDtoToEntity (PeminjamanDto peminjamandto) {
        Peminjaman peminjaman = new Peminjaman();
        peminjaman.setId_peminjaman(peminjamandto.getId_peminjaman());
        peminjaman.setId_buku(peminjamandto.getId_buku());
        peminjaman.setId_anggota(peminjamandto.getId_anggota());
        return peminjaman;
    }

    //==convertEntityToDto
    public PeminjamanDto convertEntityToDto (Peminjaman peminjamanentity){
        PeminjamanDto peminjamandto = new PeminjamanDto();
        peminjamandto.setId_peminjaman(peminjamanentity.getId_peminjaman());
        peminjamandto.setId_buku(peminjamanentity.getId_buku());
        peminjamandto.setId_anggota(peminjamanentity.getId_anggota());
        return peminjamandto;
    }

    //==create obj repository
    @Autowired
    public PeminjamanRepository peminjamanrepository;

    //==save list peminjaman
    @PostMapping("/")
    public PeminjamanDto savepeminjaman (@RequestBody PeminjamanDto peminjamanDto){
        Peminjaman peminjaman = convertDtoToEntity(peminjamanDto);
        peminjamanrepository.save(peminjaman);
        return peminjamanDto;
    }

    //==liat list
    @GetMapping("/")
    public List<PeminjamanDto> getListPeminjaman(){
        List<PeminjamanDto> list = new ArrayList<>();
        for (Peminjaman p : peminjamanrepository.findAll()){
            list.add(convertEntityToDto(p));
        }
        return list;
    }

    //==get by id peminjaman
    @GetMapping("/idpeminjaman/{id_peminjaman}")
    public Peminjaman getByIdPeminjaman (@PathVariable Integer id_peminjaman){
        Peminjaman peminjaman = new Peminjaman();
        for (Peminjaman p : peminjamanrepository.findAll()){
            if (p.getId_peminjaman() == id_peminjaman){
                peminjaman = p;
            }
        }
        return peminjaman;
    }

}

