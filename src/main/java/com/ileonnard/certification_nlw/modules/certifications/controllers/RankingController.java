package com.ileonnard.certification_nlw.modules.certifications.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import com.ileonnard.certification_nlw.modules.certifications.useCases.Top10RakingUseCase;
import com.ileonnard.certification_nlw.modules.students.entities.CertificationStudentEntity;
import com.ileonnard.certification_nlw.modules.students.repositories.CertificationStudentRepository;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("/ranking")
public class RankingController {
    
    @Autowired
    private Top10RakingUseCase top10RakingUseCase;

    @GetMapping("/top10") 
    public List<CertificationStudentEntity> top10(){
        return this.top10RakingUseCase.execute();
    }
}
