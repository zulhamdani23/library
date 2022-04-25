package com.prodemy.project.controller;

import com.prodemy.project.model.dto.BukuDto;
import com.prodemy.project.model.entity.Buku;
import com.prodemy.project.repository.BukuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/buku")
public class BukuController {
    //DtoToEntity
    public Buku convertDtoToEntity (BukuDto bukudto){
        Buku buku = new Buku();
        buku.setId_buku(bukudto.getId_buku());
        buku.setKode_buku(bukudto.getKode_buku());
        buku.setJudul_buku(bukudto.getJudul_buku());
        buku.setPenulis_buku(bukudto.getPenulis_buku());
        return buku;
    }

    //EntityToDto
    public BukuDto convertEntityToDto (Buku bukuentity){
        BukuDto bukudto = new BukuDto();
        bukudto.setId_buku(bukuentity.getId_buku());
        bukudto.setKode_buku(bukuentity.getKode_buku());
        bukudto.setJudul_buku(bukuentity.getJudul_buku());
        bukudto.setPenulis_buku(bukuentity.getPenulis_buku());
        return bukudto;
    }

    //buat obj repository
    @Autowired
    public BukuRepository bukurepository;

    //POS list buku save
    @PostMapping("/")
    public BukuDto savebuku (@RequestBody BukuDto bukuDto){
        Buku buku = convertDtoToEntity(bukuDto);
        bukurepository.save(buku);
        return bukuDto;
    }

    //GET list buku
    @GetMapping("/")
    public List<BukuDto> getListBuku(){
        List<BukuDto> list = new ArrayList<>();
        for (Buku b : bukurepository.findAll()){
            list.add(convertEntityToDto(b));
        }
        return list;
    }

    //get-by-judul

}
