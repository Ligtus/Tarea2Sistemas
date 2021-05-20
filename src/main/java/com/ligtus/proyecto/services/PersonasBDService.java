package com.ligtus.proyecto.services;

import java.util.ArrayList;

import com.ligtus.proyecto.models.Personas;
import com.ligtus.proyecto.models.PersonasRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonasBDService {
    @Autowired
    PersonasRepository personasRepository;

    public ArrayList<Personas> getPersonas() {
        return (ArrayList<Personas>) personasRepository.findAll();
    }

    public Personas insertPersona(Personas persona) {
        return personasRepository.save(pokemon);
    }
    
}
