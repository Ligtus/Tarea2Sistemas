package com.ligtus.proyecto.services;

import java.util.ArrayList;

import com.ligtus.proyecto.models.Personas;
import com.ligtus.proyecto.models.PersonasRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonasBDService {
    @Autowired
    personasRepository personasRepository;

    public ArrayList<personas> getPersonas() {
        return (ArrayList<personas>) personasRepository.findAll();
    }

    public personas insertPersona(personas persona) {
        return personasRepository.save(pokemon);
    }
}