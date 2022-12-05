package com.example.Repositories.Ex2.controllers;

import com.example.Repositories.Ex2.entities.ProgrammingLanguage;
import com.example.Repositories.Ex2.repositories.LanguagesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/languages")
public class LanguagesController {

    @Autowired
    private LanguagesRepository languagesRepository;

    @PostMapping("")
    public ProgrammingLanguage createLanguage(@RequestBody ProgrammingLanguage programmingLanguage){
        return languagesRepository.save(programmingLanguage);
    }
}
