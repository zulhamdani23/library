package com.prodemy.project.controller;

import com.prodemy.project.model.dto.PetugasDto;
import com.prodemy.project.model.entity.Petugas;
import com.prodemy.project.repository.PetugasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/petugas")
public class PetugasController {
    //convertDtoToEntity
    public Petugas convertDtoToEntity (PetugasDto petugasdto){
        Petugas petugas = new Petugas();
        petugas.setId_petugas(petugasdto.getId_petugas());
        petugas.setNama_petugas(petugasdto.getNama_petugas());
        petugas.setJabatan_petugas(petugasdto.getJabatan_petugas());
        return petugas;
    }

    //convertEntityToDto
    public PetugasDto convertEntityToDto (Petugas petugasentity){
        PetugasDto petugasdto = new PetugasDto();
        petugasdto.setId_petugas(petugasentity.getId_petugas());
        petugasdto.setNama_petugas(petugasentity.getNama_petugas());
        petugasdto.setJabatan_petugas(petugasentity.getJabatan_petugas());
        return petugasdto;
    }

    //buat objek repository
    @Autowired
    public PetugasRepository petugasrepository;

    //list-petugas
    //POS
    @PostMapping("/")
    public PetugasDto savepetugas (@RequestBody PetugasDto petugasDto){
        Petugas petugas = convertDtoToEntity(petugasDto);
        petugasrepository.save(petugas);
        return petugasDto;
    }

    //GET
    @GetMapping("/")
    public List<PetugasDto> getListPetugas(){
        List<PetugasDto> list = new ArrayList<>();
        for (Petugas p : petugasrepository.findAll()){
            list.add(convertEntityToDto(p));
        }
        return list;
    }

    //get-by-nama
    @GetMapping("/petugas-profile/{nama}")
    public Petugas getByName (@PathVariable String nama) {
        Petugas petugas = new Petugas();
        for (Petugas p : petugasrepository.findAll()){
            if (p.getNama_petugas().equalsIgnoreCase(nama)){
                petugas = p;
            }
        }
        return petugas;
    }

}
