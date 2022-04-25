package com.prodemy.project.controller;


import com.prodemy.project.model.dto.AnggotaDto;
import com.prodemy.project.model.entity.Anggota;
import com.prodemy.project.repository.AnggotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/anggota")
public class AnggotaController {
    //convertDtoToEntity
    public Anggota convertDtoToEntity (AnggotaDto anggotadto){
        Anggota anggota = new Anggota();
        anggota.setId_anggota(anggotadto.getId_anggota());
        anggota.setKode_anggota(anggotadto.getKode_anggota());
        anggota.setNama_anggota(anggotadto.getNama_anggota());
        return anggota;
    }
    //==end==

    //convertEntityToDto
    public AnggotaDto convertEntityToDto (Anggota anggotaentity) {
        AnggotaDto anggotadto = new AnggotaDto();
        anggotadto.setId_anggota(anggotaentity.getId_anggota());
        anggotadto.setKode_anggota(anggotaentity.getKode_anggota());
        anggotadto.setNama_anggota(anggotaentity.getNama_anggota());
        return anggotadto;
    }
    //==end==


    //buat objek anggotarepository
    @Autowired
    public AnggotaRepository anggotarepository;
    //==end==

    //methode pos untuk nyimpan daftar anggota
    @PostMapping("/")
    public AnggotaDto saveanggota (@RequestBody AnggotaDto anggotaDto) {
        Anggota anggota = convertDtoToEntity(anggotaDto);
        anggotarepository.save(anggota);
        return anggotaDto;
    }
    //==end==

    //methode get untuk melihat daftar anggota
    @GetMapping("/")
    public List<AnggotaDto> getListAnggota(){
        List<AnggotaDto> list = new ArrayList<>();
        for (Anggota a : anggotarepository.findAll()){
            list.add(convertEntityToDto(a));
        }
        return list;
    }
    //==end==

    //methode get untuk melihat/nampilin profil anggota
    @GetMapping("/anggota-profile/{nama}")
    public Anggota getByName (@PathVariable String nama){
        Anggota anggota = new Anggota();
        for (Anggota a : anggotarepository.findAll()) {
            if (a.getNama_anggota().equalsIgnoreCase(nama)){
                anggota = a;
            }
        }
        return anggota;
    }


}
