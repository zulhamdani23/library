package com.prodemy.project.controller;

import com.prodemy.project.model.dto.RakDto;
import com.prodemy.project.model.entity.Rak;
import com.prodemy.project.repository.BukuRepository;
import com.prodemy.project.repository.RakRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/rak")
public class RakController {
    //DtoToEntity
    public Rak convertDtoToEntity (RakDto rakdto) {
        Rak rak = new Rak();
        rak.setId_rak(rakdto.getId_rak());
        rak.setNama_rak(rakdto.getNama_rak());
        return rak;
    }

    //EntityToDto
    public RakDto convertEntityToDto (Rak rakentity){
        RakDto rakdto = new RakDto();
        rakdto.setId_rak(rakentity.getId_rak());
        rakdto.setNama_rak(rakentity.getNama_rak());
        return rakdto;
    }

    //obj repository
    @Autowired
    public RakRepository rakrepository;

    //POS list rak
    @PostMapping("/")
    public RakDto saverak (@RequestBody RakDto rakDto){
        Rak rak = convertDtoToEntity(rakDto);
        rakrepository.save(rak);
        return rakDto;
    }

    //GET
    @GetMapping("/")
    public List<RakDto> getListRak(){
        List<RakDto> list = new ArrayList<>();
        for (Rak r : rakrepository.findAll()){
            list.add(convertEntityToDto(r));
        }
        return list;
    }


}
