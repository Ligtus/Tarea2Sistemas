package com.ligtus.proyecto;

import com.ligtus.proyecto.Functions;
import java.util.Map;
import com.ligtus.proyecto.models.*;
import com.ligtus.proyecto.services.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;


 
@RestController
public class HolaMundo {
    
   @Autowired
   PersonasBDService personasBDservice;

   @AutoWired
   TranslateService translateService;

   @RequestMapping("/")
   public String saludar(){
       return "Esta es tu primera página web backend";
   }
 
   @RequestMapping("/despidete")
   public String despidete(){
       return "Adios amigo";
   }

   @RequestMapping("/contar/{word}")
   public String contar(@PathVariable String word){
       return Functions.countLetters(word);
   }

   @GetMapping("/{word}")
    public String alternarcaps(@PathVariable String word) {
        return Functions.alternateCaps(word);
    }

    @GetMapping("/guarda")
    public String insertarPersona(@RequestParam Map<String, String> datos){
        Personas persona = new Personas();
        persona.setNombre(datos.get("nombre"));
        persona.setApellidos(datos.get("apellidos"));
        persona.setEdad(Integer.parseInt(datos.get("edad")));
        personasBDservice.insertPersona(persona);
        return datos.get("nombre") + " " + datos.get("apellidos") + " " + datos.get("edad");
    }

    @GetMapping("/listar")
    public String mostrarPersonas(){
        return personasBDservice.getPersonas().toString();
    }

    @GetMapping("/traduce/{text}")
    public String traducirTexto(@PathVariable String text){
        return translateService.translate(text);
    }
}
