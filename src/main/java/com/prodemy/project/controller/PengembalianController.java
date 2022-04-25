package com.prodemy.project.controller;

import com.prodemy.project.model.dto.AnggotaDto;
import com.prodemy.project.model.dto.PengembalianDto;
import com.prodemy.project.model.entity.Anggota;
import com.prodemy.project.model.entity.Peminjaman;
import com.prodemy.project.model.entity.Pengembalian;
import com.prodemy.project.repository.PengembalianRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/pengembalian")
public class PengembalianController {
    //==convertDtoToEntity
    public Pengembalian convertDtoToEntity (PengembalianDto pengembaliandto){
        Pengembalian pengembalian = new Pengembalian();
        pengembalian.setId_pengembalian(pengembaliandto.getId_pengembalian());
        pengembalian.setTanggal_pengembalian(pengembaliandto.getTanggal_pengembalian());
        pengembalian.setId_buku(pengembaliandto.getId_buku());
        return pengembalian;
    }

    //==convertEntityToDto
    public PengembalianDto convertEntityToDto (Pengembalian pengembalianentity){
        PengembalianDto pengembaliandto = new PengembalianDto();
        pengembaliandto.setId_pengembalian(pengembalianentity.getId_pengembalian());
        pengembaliandto.setTanggal_pengembalian(pengembalianentity.getTanggal_pengembalian());
        pengembaliandto.setId_buku(pengembalianentity.getId_buku());
        return pengembaliandto;
    }

    //==obj repository
    @Autowired
    public PengembalianRepository pengembalianrepository;

    //save pengembalian
    @PostMapping("/")
    public PengembalianDto saveapengembalian (@RequestBody PengembalianDto pengembalianDto) {
        Pengembalian pengembalian = convertDtoToEntity(pengembalianDto);
        pengembalianrepository.save(pengembalian);
        return pengembalianDto;
    }

    //methode get untuk melihat daftar pengembalian
    @GetMapping("/")
    public List<PengembalianDto> getListPengembalian(){
        List<PengembalianDto> list = new ArrayList<>();
        for (Pengembalian p : pengembalianrepository.findAll()){
            list.add(convertEntityToDto(p));
        }
        return list;
    }

    //==get by id pengembalian
    @GetMapping("/idpeminjaman/{id_pengembalian}")
    public Pengembalian getByIdPengembalian (@PathVariable Integer id_pengembalian){
        Pengembalian pengembalian = new Pengembalian();
        for (Pengembalian p : pengembalianrepository.findAll()){
            if (p.getId_pengembalian() == id_pengembalian){
                pengembalian = p;
            }
        }
        return pengembalian;
    }
}
