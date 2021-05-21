package com.ligtus.proyecto;
 
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import com.ligtus.proyecto.Functions;
import java.util.Map;
import com.ligtus.proyecto.models.*;
import com.ligtus.proyecto.services.*;

 
@RestController
public class HolaMundo {
    
    @Autowired
    PersonasBDService personasBDservice;

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
        System.out.println(datos.get("nombre") + " " + datos.get("apellidos") + " " + datos.get("edad"));
        Personas persona = new Personas();
        persona.setNombre(datos.get("nombre"));
        persona.setApellidos(datos.get("apellidos"));
        persona.setEdad(Integer.parseInt(datos.get("edad")));
        personasBDservice.insertPersona(persona);
    }

    @GetMapping("/listar")
    public String mostrarPersonas(){
        return personasBDservice.getPersonas().toString();
    }
}
